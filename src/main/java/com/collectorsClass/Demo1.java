/**
 * 
 */
package com.collectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some examples of using Collectors class and other similar approaches 
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * goal:  get the list of names, in upper case, of those who are older than 30 
		 */
		
		// get data
		List<Person> personList = InterfacePersonData.personsList();
										
		/*
		 * Not a good approach - 1 
		 */
		
		// collection of names
		List<String> personNames1 = new ArrayList<>();
		List<String> personNames2 = new ArrayList<>();
		List<String> personNames3 = new ArrayList<>();
		
		// process the data
		personList.stream().filter(person -> person.getAge() > 30).
									 map(Person :: getName).
									 map(String :: toUpperCase).
									 forEach(name -> personNames1.add(name));			// an impure function - shared mutability
		// print data
		System.out.println("Person with age > 30 : "+personNames1.toString());
		
		/*
		 * Proper approach - 2 : too much complex & verbos
		 */
		personNames2 = personList.stream().filter(person -> person.getAge() > 30).
													map(Person :: getName).
													map(String :: toUpperCase).
													reduce(new ArrayList<String>(), 	// reduce() of useful for type parallel stream takes 3 args
															(names, name) -> {				// 1. an empty collection to start with
																names.add(name);				// 2. execution process on one thread (add a single)
																return names;					// name into a list of names
															},
															(names1, names2) -> {			// 3. when parallel stream is in action, the process to 
																names1.addAll(names2);	// finally collect the sub level data at each thread 
																return names1;					// into final result
															});																							
		// print the data
		System.out.println("Person with age > 30 : "+personNames2.toString());
		
		/*
		 * Proper approach - 3
		 */
		personNames3 = personList.stream().filter(person -> person.getAge() > 30).
															map(Person :: getName).
															map(String :: toUpperCase).
															collect(Collectors.toList());
		
		// print the data
		System.out.println("Person with age > 30 : "+personNames3.toString());
	}

}
