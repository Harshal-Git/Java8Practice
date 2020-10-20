/**
 * 
 */
package com.java9.iterateDemo;

import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 *	-> This is a demo to the iterate() method of Java-8 version.
 *
 *	-> We had to apply some additional stream related functions to control 
 *		the size of the stream. 
 */
public class IterateMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Print stream data: ");

		/**
		 *	Finite stream:
		 * 	accepting 2 arguments 
		 * 
		 * 1. start point (seed)
		 * 2. Unary operator (progress operation on each element - from start)
		 */
		Stream.iterate(1, num -> num + 1).limit(15).forEach(IterateMethodDemo :: print);
	}

	private static void print(int data) {
		System.out.print(data+" ");
	}
}
