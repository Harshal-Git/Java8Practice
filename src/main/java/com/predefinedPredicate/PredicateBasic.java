/**
 * 
 */
package com.predefinedPredicate;

import java.util.function.Predicate;

/**
 * @author Harshal-Git
 *
 */
public class PredicateBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * both of the below definitions are same
		 * One with anonymous Impl and second is lambda expression
		 */
		// anonymous impl
		Predicate<Integer> evenNum1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return (t % 2 == 0);
			}
		};
		
		// lambda expression
		Predicate<Integer> evenNum2 = data -> (data%2 == 0);
		
		System.out.println("20 even ? -> "+evenNum1.test(20));
		System.out.println("31 even ? -> "+evenNum2.test(31));
		
		
		// string length predicate
		Predicate<String> lengthCheck = (data) -> ((data != null) && (data.length() >= 5));
		
		System.out.println("Length > 5 ? -> "+ lengthCheck.test("this is predicate"));
	}
}
