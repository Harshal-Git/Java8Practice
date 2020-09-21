/**
 * 
 */
package com.methodRefOperator;

/**
 * @author Harshal-Git
 *
 *	-> a normal lambda expression usability 
 */
public class MethodRefOpDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// runnable interface impl
		Runnable r1 = () -> {
				for(int count= 1; count <= 5; count++) {
					System.out.println("Child thread...");
				}
		};
		
		// use runnable reference
		Thread t1 = new Thread(r1);
		t1.start();
		
		// main thread work
		for(int count= 1; count <= 5; count++) {
			System.out.println("Main thread...");
		}
	}
}
