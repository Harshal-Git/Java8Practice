/**
 * 
 */
package com.collectorsClass;

import java.util.Comparator;
import java.util.List;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> Sorting
 */
public class Demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get person data
		List<Person> persons = InterfacePersonData.personsList();
		
		// print persons with sorted by name
		System.out.println("Person sorted data by name: ");
		persons.stream().
		sorted(Comparator.comparing(Person :: getName)).		
		forEach(System.out :: println);
		
		System.out.println("\n\nPerson sorted data by age & then name: ");
		persons.stream().
		sorted(Comparator.comparing(Person :: getAge).
		thenComparing(Person :: getName)).		
		forEach(System.out :: println);
		
		/*
		 * sorted has 2 version
		 * 1. natural sorting (no args)
		 * 2. with a comparator (mandatory for custom class)
		 * 
		 * -> second option accepts a static method type comparing- which internally accepts a function
		 * 
		 * -> it supports chaining operations also 
		 */
	}
}