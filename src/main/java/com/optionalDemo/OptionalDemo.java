/**
 * 
 */
package com.optionalDemo;

import java.util.Optional;

/**
 * @author Harshal-Git
 * -> how to use Optional :
 * 
 * -> If we are not sure the object might have the null value - use the method ofNullable()
 * -> Else use method of() from optional class -> [passing null for of() method may cause NPE] 
 * 
 */
public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String value= "user";
		//String value= null;
		
		Optional<String> optionalObj = null;
		
		optionalObj= Optional.ofNullable(value);
		//optionalObj = Optional.of(value);

		System.out.println("Optional object is present ? " + optionalObj.isPresent());
		System.out.println("Optional obj - orElseGet : " + optionalObj.orElseGet(() -> "[none]"));
		System.out.println(optionalObj.map(s -> "Hey " + s + "!").orElse( "Hey Stranger!" ));
	}
}
