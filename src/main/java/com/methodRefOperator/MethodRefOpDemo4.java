/**
 * 
 */
package com.methodRefOperator;

/**
 * @author Harshal-Git
 * 
 * -> a lambda expression with a method reference operator
 *
 *	-> this will improve code reusability
 *
 *	-> few things to consider are:
 *
 *		1. scope can be different compared to actual method signature
 *		2. return type can be different compared to actual method signature
 *		3. name can also be different compared to actual method signature
 *		4. arguments must match with actual method signature
 */
public class MethodRefOpDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// interface reference 1
		Intf1 ref1 = (num1, num2) -> (num1+num2);
		
		// interface reference 2
		Intf1 ref2 = MethodRefOpDemo4 :: add;
		
		// use the method
		System.out.println("Sum(10, 20): "+ref1.sum(10, 20));
		System.out.println("Sum(15, 20): "+ref2.sum(15, 20));
	}
	
	// kind of replication of method of Intf1 :: sum()
	public static int add(int num1, int num2) {
		return (num1+num2);
	}
}

interface Intf1 {
	
	// signature
	public abstract int sum(int a, int b);
}