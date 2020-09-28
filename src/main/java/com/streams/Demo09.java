/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author Harshal-Git
 *
 *	-> exception handling while using reduce() 
 *
 *		-> just an approach to see how lambda expression should not be spoiled with extra codes
 *	
 *		-> operation:
 *			divide the numbers of stream with given divisor and sum those numbers 
 */
public class Demo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare list data
		List<Integer> data = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		
		// divisor of the data
		int divisor = 7;
		
		System.out.println("Data: "+data.toString());
		System.out.println("Divisor: "+divisor);
		
		// result - approach 1
		double result1 = data.stream().reduce(0, (tempRes, newData) -> (tempRes + (newData/divisor)));
		System.out.println("Result1: "+result1);
		
		/*
		 * In the above case, if the divisor is 0, it will throw Arithmetic exception. To handle such case, we 
		 * need to change the lambda expression to handle such case - which will spoil the expression.   
		 */
		/*double result2 = data.stream().reduce(0, 
				(tempRes, newData) -> {
														try {
															return (tempRes + (newData/divisor));
														} catch(ArithmeticException exc) {
															System.err.println("ArithmeticException occured. Divide by 0 performed.");
														}
														return -1;
													});
		System.out.println("Result2: "+result2);*/
		
		/*
		 * so to handle such case, where lambda expression is spoiled, we can use a separate method reference
		 * to handle the exception check internally and the one liner syntax can be kept.
		 * 	
		 * 	-> BinaryOperator : inheriting BiFunction (First Arg - F, Second Arg - S, Return type - R) 
		 * 							R apply (F , S)	
		 */
		BinaryOperator<Integer> reduceOp = (tempRes, newData) -> divide(tempRes, newData, divisor);
		double result3 = data.stream().reduce(0, reduceOp);
		System.out.println("Result3: "+result3);
	}
	
	private static int divide(int tempRes, int newElement, int divisor) {
		try {
			return (tempRes + (newElement/divisor));
		} catch(ArithmeticException exc) {
			System.err.println("ArithmeticException occured. Divide by 0 performed.");
		}
		return -1;
	}
}
