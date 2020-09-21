/**
 * 
 */
package com.predefinedUnaryBinary;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Harshal-Git
 *
 *	-> Unary operator - a child of "java.util.Function" can be used to apply such functions
 *		for which the argument and return type are of same type.
 *
 * -> It has an improved version for primitive data types also. 
 */
public class UnaryFunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// function to square a number
		UnaryOperator<Integer> squareFun1 = (num) -> (num*num);
		
		// apply function
		System.out.println("square(23): "+squareFun1.apply(23));
		
		// to return the passed argument
		//System.out.println((UnaryOperator.identity().apply(23)));
		
		// improved version
		IntUnaryOperator squareFun2 = (num) -> (num*num);
		
		// apply function
		System.out.println("square(24): "+squareFun2.applyAsInt(24));
		
	}
}
