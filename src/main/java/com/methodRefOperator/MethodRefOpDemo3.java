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
public class MethodRefOpDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Runnable interface impl - refer to an existing method
		 * 
		 * This is translated as: run() method referring a non-static
		 * to runnableImpl() method w.r.t current class object
		 */
		
		MethodRefOpDemo3 ob1 = new MethodRefOpDemo3(); 
		
		// runnable reference
		Runnable r1;
		
		// valid first type of call
		//r1 = ob1 :: runnableImpl1;
		
		// valid second type of call
		r1 = ob1 :: runnableImpl2;
		
		// use runnable reference
		Thread t1 = new Thread(r1);
		t1.start();

		// main thread work
		for(int count= 1; count <= 5; count++) {
			System.out.println("Main thread...");
		}
	}

	// provide an independent method to be referred by Runnable implementation
	public void runnableImpl1() {
		for(int count= 1; count <= 5; count++) {
			System.out.println("Child thread...");
		}
	}
	
	// different scope and return type are allowed - but arguments must match
	private int runnableImpl2() {
		int count= 1;
		while(count <= 5) {
			System.out.println("Child thread...");
			count++;
		}
		return count;
	}
}
