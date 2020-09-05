/**
 * 
 */
package com.lambdaExpBasics;

/**
 * @author Harshal-Git
 * 
 *	-> conventional thread demo 
 */
public class ThreadDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// conventional thread initialization
		MyRunnable runnableInst = new MyRunnable();
		
		// Child thread object t1
		Thread t1 = new Thread(runnableInst);
		t1.start();
		
		// main thread 
		for(int iM = 1 ; iM <= 5; iM++) {
			System.out.println("Main thread- "+iM);
		}
	}
}

// Runnable interface implementation
class MyRunnable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for(int i  = 1; i <= 5; i++) {
			System.out.println("Child therad -"+i);
		}
	}
	
	
}
