/**
 * 
 */
package com.oldPrograms.optionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Harshal-Git
 * -> this program to demonstrate finding first element from the list of Optionals - OR return null if nothing found
 */
public class FindFirstFromOptionalsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// list of random optional values
		List<Optional<String>> optionalList = Arrays.asList(Optional.empty(), Optional.of("hello"), Optional.ofNullable(null), Optional.of("world."));

		System.out.println("First from list of optionals: "+optionalList.stream().
																												filter(Optional :: isPresent).
																												map(Optional :: get).
																												findFirst().
																												orElse(null));
	}
}
