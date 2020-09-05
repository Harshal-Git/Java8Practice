/**
 * 
 */
package com.lambdaExpBasics;

/**
 * @author Harshal-Git
 *
 *	-> thread demo with lambda expression
 */
public class ThreadDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// thread initialization with lambda expression
		Runnable runnableInst = () -> {

			for(int i = 1 ; i <= 5; i++) {
				System.out.println("Child thread- "+i);
			}
		};

		// Child thread object t1
		Thread t1 = new Thread(runnableInst);
		t1.start();

		// main thread 
		for(int iM = 1 ; iM <= 5; iM++) {
			System.out.println("Main thread- "+iM);
		}
	}
}
