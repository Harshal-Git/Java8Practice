/**
 * 
 */
package com.oldPrograms.typeInferenceDemo;

import java.util.function.Function;

/**
 * @author Harshal-Git
 *
 */
public class Answers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Function<Long, Long> fun1= x -> x+1;

		Runnable helloWorld= () -> System.out.println("Hello world...");
		
		helloWorld.run();
	}

}
