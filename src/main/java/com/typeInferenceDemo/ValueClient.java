/**
 * 
 */
package com.typeInferenceDemo;

/**
 * @author Harshal-Git
 *
 */
public class ValueClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Value<String> value= new Value<>();
		
		// because of java 8 type inference; static method call from "Value" class doesn't need the type specified in the code
		value.getValORDefault("123", Value.getDefaultValue());
		
		// for older version (< 8) type specification was needed; otherwise it will give compile time error
		value.getValORDefault("123", Value.<String>getDefaultValue());
		
	}

}
