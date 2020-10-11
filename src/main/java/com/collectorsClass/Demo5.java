/**
 * 
 */
package com.collectorsClass;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some more functions
 */
public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get person data
		List<Person> persons = InterfacePersonData.personsList();
		
		/*
		 * get max / min age 
		 */
		// approach 1
		System.out.println("Min age: "+persons.stream().map(Person :: getAge).min((age1, age2) -> ((age1 > age2) ? (1) : ((age1 < age2) ? (-1) : (0)))));
		
		// approach 2 (best suitable)
		System.out.println("Max age: "+persons.stream().mapToInt(Person :: getAge).max());
		
		/*
		 * max aged person
		 */
		System.out.println("Max aged person: "+persons.stream().collect(Collectors.maxBy(Comparator.comparing(Person :: getAge))));
		
		/*
		 * name of the max aged person
		 * -> imp : collectingAndThen(Collector, Function)
		 */
		System.out.println("Max aged person: "+persons.stream().collect(Collectors.collectingAndThen(
																												Collectors.maxBy(Comparator.comparing(Person :: getAge)), 
																												person -> person.map(Person :: getName).orElse(""))));
		
		/*
		 * show the names of people, grouped by age   
		 */
		Map<Integer, List<String>> ageGroupedName = persons.stream().collect(
																											Collectors.groupingBy(Person :: getAge, 				// group by age
																											Collectors.mapping(Person :: getName, 				// map their name
																											Collectors.toList())));											// collect such names into a list
		System.out.println("Grouped by age: "+ageGroupedName.toString());
		
		/*
		 * show the names of people, grouped by age who has length of their name > 4  
		 */
		Map<Integer, List<String>> ageGroupedNames = persons.stream().collect(
																											Collectors.groupingBy(Person :: getAge, 				// group by age
																											Collectors.mapping(Person :: getName, 				// map their name
																											Collectors.filtering(name -> name.length() > 4, 	// length of which is > 4
																											Collectors.toList()))));										// collect such names into a list
		System.out.println("Grouped by age (filtered): "+ageGroupedNames.toString()+"\n");
	}

}
