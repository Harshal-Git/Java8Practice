/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @author Harshal-Git
 *
 *	-> a good example to understand the difference of performance 
 *		between imperative v/s declarative
 */
public class Demo15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// start / end times
		long startTime, endTime, diffImp, diffDec;
		
		// data list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

		// aim: given an ordered (remember: Ordered & not sorted) list, 
		// find double of the first even number greater than 3

		/*
		 * seeing the difference of performance between
		 * imperative v/s declarative 
		 */
		startTime = getTime();
		int impRes = imperative(numbers);
		endTime = getTime();
		
		// find difference for imperative method
		diffImp = (endTime-startTime);
		
		// reset everything
		startTime = 0l;
		endTime = 0l;
		
		startTime = getTime();
		int decRes = declarative(numbers);
		endTime = getTime();
		
		// find difference for declarative method
		diffDec = (endTime-startTime);
		
		System.out.println("Imperative result: "+impRes);
		System.out.println("Declarative result: "+decRes);
		System.out.println("Imperative time: "+(diffImp)+" ms. ");
		System.out.println("Declarative time: "+(diffDec)+" ms. ");
	}

	/**
	 * @param numbers
	 */
	private static int imperative(List<Integer> numbers) {
		int result= 0;
		for(int num : numbers) {
			if(num > 3 && num % 2 == 0) {
				result= num * 2;
				break;
			}
		}
		return result;
	}

	/**
	 * @param numbers 
	 * 
	 */
	private static int declarative(List<Integer> numbers) {
		return numbers.stream().
				filter(num -> num > 3).
				filter(num -> num % 2 == 0).
				map(num -> num * 2).
				findFirst().get().intValue();
	}

	private static long getTime() {
		return Calendar.getInstance().getTimeInMillis();
	}
}
