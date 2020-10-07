/**
 * 
 */
package com.optional;

import java.util.Optional;

/**
 * @author Harshal-Git
 *
 *	-> other helpful methods
 */
public class OptionalDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get() method on valid objects
		String data1 = "hello";
		Optional<String> op1 = Optional.ofNullable(data1);
		System.out.println("op1 data: "+op1.get());
		
		// get() method on NULL object will throw No such element exception if element is not found.
		String data2 = null;
		Optional<String> op2 = Optional.ofNullable(data2);
		//System.out.println("op2 data: "+op2.get());
		
		
		// filter method on optional object 
		int year = 2020;
		Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
	    System.out.println("is2016 ? -> "+is2016);
	    boolean is2020 = yearOptional.filter(y -> y == 2020).isPresent();
	    System.out.println("is2020 ? -> "+is2020);
	}

}
