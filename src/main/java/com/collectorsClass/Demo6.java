/**
 * 
 */
package com.collectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 *	-> usage of flatmap
 */
public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 *  Understanding different types of functions
		 *  and going to flatmap 
		 */
		
		// prepare data
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Actual numbers: "+numbers.toString());
		
		/**
		 * 1. one to one function (one input -> one output - as a case here : double the number)
		 * -> Stream<T>.map(f11) ===> returns Stream<R> 
		 */
		System.out.println("One to one function: "+numbers.stream().
																			map(num -> num * 2).
																			collect(Collectors.toList()).toString());
	
		/**
		 *  2. one to many function (one input -> many output - as a case here : list of numbers between the range
		 * (number -1) and (number + 1) based on given number 
		 * -> Stream<T>.map(f1n) ===> returns Stream<Collection<R>>
		 */
		System.out.println("One to many function: "+numbers.stream().
																					map(num -> List.of(num-1, num+1)).
																					collect(Collectors.toList()).toString());
		
		/**
		 *  3. one to many function (one input -> many output - as a case here : list of numbers between the range
		 *  (number -1) and (number + 1) based on given number
		 *  
		 *  But flatMap() would need a stream for mapping
		 *  
		 * -> Stream<T>.flatMap(f1n) ===> returns Stream<R>
		 */
		System.out.println("One to many function - flatMap(): "+numbers.stream().
																							flatMap(num -> List.of(num-1, num+1).stream()).
																							collect(Collectors.toList()));
	}

}
 