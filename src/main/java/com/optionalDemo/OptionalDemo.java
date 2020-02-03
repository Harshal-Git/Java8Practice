/**
 * 
 */
package com.optionalDemo;

import java.util.Optional;

/**
 * @author Harshal-Git
 *
 */
public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String value= "123";
		
		Optional<String> fullName = Optional.ofNullable(value);

		System.out.println("Full Name is set? " + fullName.isPresent());
		System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
		System.out.println(fullName.map(s -> "Hey " + s + "!").orElse( "Hey Stranger!" ));
	}
}
