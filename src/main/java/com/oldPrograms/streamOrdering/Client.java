/**
 * 
 */
package com.oldPrograms.streamOrdering;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ordered collection demo 
		listOrderDemo();
		
		// disordered collection demo
		setOrderDemo();
	}

	/**
	 * Demo for set ordering via stream
	 * 
	 * -> here results are not always false / true : keeps changing
	 */
	private static void setOrderDemo() {
		
		// base line set (observe the order of elements here)
		Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 1, 2, 4));
		
		// set created from stream
		List<Integer> newNumbers= numbers.stream().collect(Collectors.toList());
		
		// same collection can be applied with an intermediate sorted operation
		List<Integer> newNumbersSorted= numbers.stream().sorted().collect(Collectors.toList());
		
		// here output of set might not follow the insertion order
		System.out.println("Set - "+numbers.toString());
		System.out.println("List (from set -> stream) - "+newNumbers.toString());
		System.out.println("List (from set -> stream) - "+newNumbersSorted.toString());
	}

	/**
	 * Demo for list ordering via stream
	 */
	private static void listOrderDemo() {
		
		// a base line list
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		
		// streamed and collected list from above list
		List<Integer> collection= numbers.stream().collect(Collectors.toList());
		
		System.out.println("Are both list same? "+numbers.equals(collection));
	}

}
