/**
 * 
 */
package com.lambdaExpBasics;

/**
 * @author Harshal-Git
 *
 *	-> this is to demo how many "return" statements are valid with lambda expression & combination of curly braces.
 *		Basic rules are:
 *
 *		1. 
 */
public class ValidReturnStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// valid expression 1
		Subtract subObj1 = (a, b) -> { return (a-b); };
		
		// valid expression 2
		Subtract subObj2 = (p, q) -> (p - q);
		
		System.out.println("subtract(10, 20) = "+subObj1.subtract(10, 20));
		
		System.out.println("subtract(6, 3) = "+subObj2.subtract(6, 3));
		
		/*
		 * Invalid expressions:
		 * 
		 * 	-> more than one statement inside lambda expression, curly braces are needed.
		 */
		// with "return" - braces are needed
		//Subtract subObj3 = (a, b) ->  return (a-b);
		
		// missing parenthesis at the return statement 
		//Subtract subObj4 = (a, b) -> { return (a-b) };
		
		// with "braces" - return statement is needed (if any)
		//Subtract subObj5 = (a, b) -> { (a-b); };
	}
}

// interface
interface Subtract {
	public abstract int subtract(int data1, int data2);
}