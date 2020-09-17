/**
 * 
 */
package com.predefinedPredicate;

import java.util.function.Predicate;

/**
 * @author Harshal-Git
 *
 */
public class PredicateJoining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] numbers = {0, 5, 10, 15, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14}; 
		
		// predicates 
		Predicate<Integer> pred1 = (data) -> (data%2 == 0);
		Predicate<Integer> pred2 = (data) -> (data >= 5 && data <= 15);

		// Group 1: AND
		System.out.print("Even numbers between 5 and 15: ");
		for (int num : numbers) {
			if(pred1.and(pred2).test(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.println("\n");
		
		// Group 2: OR
		System.out.print("Even numbers OR number between 5 and 15: ");
		for (int num : numbers) {
			if(pred2.or(pred1).test(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.println("\n");
	
		// Group 3: numbers which are Odd 
		System.out.print("Odd numbers: ");
		for (int num : numbers) {
			if(pred1.negate().test(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
		
	}

}
