/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 *	-> basic stream programs
 */
public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare a list 
		List<Integer> marks = new ArrayList<>();
		
		// put data
		marks.add(70);marks.add(45);marks.add(10);
		marks.add(65);marks.add(20);marks.add(25);
		
		// print data
		System.out.println("Marks: "+marks.toString());
		
		/*
		 *  count failed students ( < 35) - with filter & count()  
		 */
		int failedStudents = (int) marks.stream().filter((mark) ->(mark < 35)).count(); 
		System.out.println("Number of failed students: "+failedStudents);
		
		// sorting ascending order
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Marks sorted: "+sortedMarks.toString());
		
		// customized sorting (approach 1)
		Comparator<Integer> descendingMarks= (mark1, mark2) -> {
																			return ((mark1 < mark2) ? (1) : ((mark1 > mark2) ? (-1) : (0)));
																		};
		List<Integer> revSortedMarks1 = marks.stream().sorted(descendingMarks).collect(Collectors.toList());
		System.out.println("Marks reverse sorted: "+revSortedMarks1.toString());
		
		// approach 2
		List<Integer> revSortedMarks2 = marks.stream().sorted((mark1, mark2) -> mark2.compareTo(mark1)).collect(Collectors.toList());
		System.out.println("Marks reverse sorted: "+revSortedMarks2.toString());
	}

}
