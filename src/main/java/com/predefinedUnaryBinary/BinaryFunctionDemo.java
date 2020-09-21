/**
 * 
 */
package com.predefinedUnaryBinary;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

/**
 * @author Harshal-Git
 *
 *	-> A child of BiFunction - where both inputs and the return all are of same type.
 */
public class BinaryFunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// return sum of 2 numbers
		BinaryOperator<Integer> sumFun1 = (num1, num2) -> (num1+num2);
		
		// apply function
		System.out.println("sum(10, 15): "+sumFun1.apply(10, 15));
		
		// improved version
		DoubleBinaryOperator doubleFun1 = (num1, num2) -> (num1+num2);

		// apply function
		System.out.println("sum(10.0, 15.0): "+doubleFun1.applyAsDouble(10.0, 15.0));
	}
}
