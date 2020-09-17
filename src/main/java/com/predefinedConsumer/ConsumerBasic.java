/**
 * 
 */
package com.predefinedConsumer;

import java.util.function.Consumer;

/**
 * @author Harshal-Git
 *
 */
public class ConsumerBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// print a string length
		Consumer<String> cons1 = (data) -> System.out.println(data+"-> length: " +data.length());
		
		// consumer usage
		cons1.accept("this is consumer");
	}

}
