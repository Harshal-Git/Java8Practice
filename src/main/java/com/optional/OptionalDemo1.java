/**
 * 
 */
package com.optional;

import java.util.Optional;

/**
 * @author Harshal-Git
 *
 *	-> different usage of Optional class
 */
public class OptionalDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create an empty (with no value) object
		Optional<String> emptyOp = Optional.empty();
		System.out.println("Empty optional: "+emptyOp.toString()+"\n");
		
		/*
		 * methods to provide an invalid / valid object
		 * and checking the presence accordingly  
		 */
		String data1 =  "optional";
		Optional<String> ob1 = Optional.of(data1);
		System.out.println("ob1.isPresent()? "+ob1.isPresent());
		//System.out.println("ob1.isEmpty()? "+ob1.isEmpty());
		ob1.ifPresent(data -> System.out.println("Length: "+data.length()+"\n"));
		
		// if data is Not null, of() & ofNullable() will give same result
		String data2 = "optiona 1";
		Optional<String> ob2 = Optional.ofNullable(data2);
		System.out.println("ob2.isPresent()? "+ob2.isPresent());
		//System.out.println("ob2.isEmpty()? "+ob2.isEmpty());
		ob2.ifPresent(data -> System.out.println("Length: "+data.length()+"\n"));
		
		/*
		 * if we know in advance that the value can be NULL 
		 * try ofNullable() which allows possible null objects.
		 * 
		 * of() method with null data will give NPE
		 */
		String data3 = null;
		Optional<String> ob3 = Optional.ofNullable(data3);
		System.out.println("ob3.isPresent()? "+ob3.isPresent());
		//System.out.println("ob3.isEmpty()? "+ob3.isEmpty());
		ob3.ifPresentOrElse(data -> System.out.println("Length: "+data.length()+"\n"), 
				() -> System.out.println("No data present."));
	}
}
