/**
 * 
 */
package com.predefinedPredicate;

import java.util.function.BiPredicate;

/**
 * @author Harshal-Git
 *
 */
public class BiPredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// check whether sum of 2 numbers is even OR not
		BiPredicate<Integer, Integer> evenSum = (num1, num2) -> ((num1.intValue()+num2.intValue()) %2 == 0);
		
		// check above predicate
		System.out.println("sum(1,3) even ? -> "+evenSum.test(1, 3));
		System.out.println("sum(2,3) even ? -> "+evenSum.test(2, 3));
		
	}

}
