/**
 * 
 */
package com.collectorsClass;

import static java.util.stream.Collectors.flatMapping;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.stream.Stream;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some more usage of flatmap
 *	-> used static import 
 */
public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get person data
		List<Person> persons = InterfacePersonData.personsList();
		
		// print all characters in all names of person
		/*
		 * if we use map() - it will return List<List<String>>
		 * if we use flatMap() - it will return List<String> : but only the thing to remember is that flatMap() needs a Stream as input
		 */
		List<List<String>> namesCharList1 = persons.stream().map(Person :: getName).map(name -> List.of(name.split(""))).collect(toList());
		System.out.println("Characters list: "+namesCharList1.toString());
		
		List<String> namesCharList2 = persons.stream().map(Person :: getName).flatMap(name -> Stream.of(name.split(""))).collect(toList());
		System.out.println("Characters list: "+namesCharList2.toString());
		
		/*
		 * get all characters in names of person grouped by their age   
		 */
		System.out.println("Grouped characters of a person: "+persons.stream().collect(groupingBy(Person :: getAge, 		
																									flatMapping(person -> Stream.of(person.getName().split("")), 
																									toSet()))));
			
		System.out.println("Grouped characters of a person: "+persons.stream().collect(groupingBy(Person :: getAge,				// get age
																									mapping(person -> person.getName().toUpperCase(), 		// map name to upper case
																									flatMapping(name -> Stream.of(name.split("")), 				// do flatmap of these characters
																									toSet())))));																	// put the data into set
	}

}
