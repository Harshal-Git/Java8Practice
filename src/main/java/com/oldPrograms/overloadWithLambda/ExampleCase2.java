/**
 * 
 */
package com.oldPrograms.overloadWithLambda;

import java.util.function.Predicate;

/**
 * @author Harshal-Git
 * -> Case#2 --> because 2 different entity are being used for overloaded methods, this ambiguity occurs. 
 */
public class ExampleCase2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * compile time error - overloadMethod() is being identified as ambiguous for given arguments
		 */
		//overloadMethod(x -> true);
		
		/**
		 * solutions: type case into either of the type of interface
		 */
		overloadMethod((Predicate<Integer>) (x -> true));
		overloadMethod((IntPredicate) (x -> true));
	}

	private static void overloadMethod(Predicate<Integer> predicate) {
		System.out.println("Predicate type...");
	}
	
	private static void overloadMethod(IntPredicate intPredicate) {
		System.out.println("IntPredicate type...");
	}
}
