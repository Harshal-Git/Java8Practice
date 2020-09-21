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
 *	-> it is an alternative of lambda expression
 */
public class MethodRefOpDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Runnable interface impl - refer to an existing method
		 * 
		 * This is translated as: run() method referring 
		 * to a static runnableImpl() method
		 */
		Runnable r1 = MethodRefOpDemo2 :: runnableImpl;
		
		// use runnable reference
		Thread t1 = new Thread(r1);
		t1.start();

		// main thread work
		for(int count= 1; count <= 5; count++) {
			System.out.println("Main thread...");
		}
	}

	// provide an independent method to be referred by Runnable implementation
	public static void runnableImpl() {
		for(int count= 1; count <= 5; count++) {
			System.out.println("Child thread...");
		}
	}
}
