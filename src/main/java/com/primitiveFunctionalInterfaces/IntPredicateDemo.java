/**
 * 
 */
package com.primitiveFunctionalInterfaces;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * @author Harshal-Git
 *
 */
public class IntPredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * demo to use primitive "int" with Predicate
		 * 
		 * As Predicate<> will use wrapper types, multiple auto boxing & un-boxing will happen in 
		 * 	lambda expression and actual computation. To avoid this unnecessary process, primitive 
		 * type functional interfaces are also present.
		 * 
		 * It's better to use generic typed functional interfaces only when we really want to deal with wrapper types.
		 */
		// check any number is even OR not
		IntPredicate evenNum = (num) -> (num%2 == 0);
		
		// check with data
		int [] data = {0, 5, 10, 15, 20, 25, 30};
		
		System.out.println("Data: "+Arrays.toString(data));
		System.out.print("Even numbers: ");
		
		for(int num : data) {
			if(evenNum.test(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}

}
