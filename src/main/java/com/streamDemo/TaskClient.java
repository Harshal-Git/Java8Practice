/**
 * 
 */
package com.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 */
public class TaskClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create 5 task objects (having total 100 points)
		Task t1= new Task("T1", TaskStatus.OPEN, 8);
		Task t2= new Task("T2", TaskStatus.OPEN, 3);
		Task t3= new Task("T3", TaskStatus.CLOSE, 2);
		Task t4= new Task("T4", TaskStatus.OPEN, 5);
		Task t5= new Task("T5", TaskStatus.CLOSE, 4);
		
		// put that in collection
		List<Task> tasks= Arrays.asList(t1, t2, t3, t4, t5);
		
		/*
		 * 1. calculate total points of open tasks using sum()
		 * steps:
		 * 1. filter tasks with OPEN status
		 * 2. get points for those OPEN tasks (apply getPoints() function to filtered tasks)
		 * 3. get sum of points
		 */
		int totalOpenPoints= tasks.stream().
															filter( task -> task.getStatus()== TaskStatus.OPEN).
															mapToInt(Task :: getPoints).
															sum();
		System.out.println("Total points for open tasks: "+totalOpenPoints);
		

		/*
		 * 2. Calculate total points for all tasks with parallel approach
		 * steps:
		 * 1. apply function to find points for all tasks and return sum 
		 * 		OR
		 * 2. choose map+reduce to find iterative total - with start point
		 */
		int totalPoints1= tasks.stream().parallel().
																	mapToInt(Task :: getPoints).
																	sum();
		
		int totalPoints2= tasks.stream().parallel().
																	map( Task :: getPoints).
																	reduce(0, Integer :: sum);
		
		System.out.println("Total points 1: "+totalPoints1);
		System.out.println("Total points 2: "+totalPoints2);
		
		/*
		 * 3. group tasks by their status
		 * steps:
		 * 1. Collect the tasks by grouping with task status 
		 */
		Map<TaskStatus, List<Task>> taskGroup= tasks.stream().
																							collect(Collectors.groupingBy(Task :: getStatus));
		System.out.println("Grouped tasks: "+taskGroup);
	}
}
