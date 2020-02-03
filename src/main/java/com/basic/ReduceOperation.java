/**
 * 
 */
package com.basic;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 */
public class ReduceOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Prepare a function as conventional manner (using anonymous inner class)
		 * BinaryFunction accepts 2 numbers and return a single number which is processed results of both arguments.
		 */
		BinaryOperator<Integer> totalFun= new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer start, Integer element) {
				return (start+element);
			}
		};
		
		// using BinaryOperator function
		int total1 = Stream.of(1, 3, 5, 7, 9, 2, 4, 6, 8).
																		reduce(0, totalFun);

		// reduce operation - using lambda instead of function argument
		int total2 = Stream.of(1, 3, 5, 7, 9, 2, 4, 6, 8).
																		reduce(0, (start, element) -> start + element);
		
		System.out.println("Total1 (1 to 9) - "+total1);
		System.out.println("Total2 (1 to 9) - "+total2);
		
		/*
		 * another approach of "apply"ing the BinaryOperator function
		 * find total 1 -> 4
		 */
		int total3= totalFun.apply(
											totalFun.apply(
													totalFun.apply(1, 2),
													3), 
											4);
		System.out.println("Total3 (1 to 9) - "+total3);
	}

}
