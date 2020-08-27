/**
 * 
 */
package com.oldPrograms.overloadWithLambda;

import java.util.function.BinaryOperator;

/**
 * @author Harshal-Git
 * Case#1 --> The "IntegerBiFunction" type is more specific for the given lambda expression. Hence printing the message accordingly.
 */
public class ExampleCase1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Type of the lambda expression is --> ");
		overloadedMethod((x, y) -> (x+y));
	}

	private static void overloadedMethod(BinaryOperator<Integer> func) {
		System.out.println("BinaryOperator type...");
	}
	
	private static void overloadedMethod(IntegerBiFunction biFunc) {
		System.out.println("IntegerBiFunction extending BinaryOperator type...");
	}
}
