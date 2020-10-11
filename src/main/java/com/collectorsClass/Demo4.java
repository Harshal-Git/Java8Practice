/**
 * 
 */
package com.collectorsClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some more methods
 */
public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get person data
		List<Person> persons = InterfacePersonData.personsList();

		/**
		 * Goal: group person by their names
		 */
		/*
		 * Iterative approach:
		 */
		Map<String, List<Person>> groupByName = new HashMap<>();

		List<Person> dataList = null;

		for(Person person : persons) {
			if(groupByName.containsKey(person.getName())) {
				dataList = groupByName.get(person.getName());
			}
			else {
				dataList = new ArrayList<>();
				groupByName.put(person.getName(), dataList);
			}
			dataList.add(person);
		}
		System.out.println("Grouped by name: "+groupByName.toString()+"\n");
		
		/*
		 * Functional approach
		 */
		Map<String, List<Person>> groupedByName = persons.stream().collect(Collectors.groupingBy(Person :: getName));
		System.out.println("Grouped by name: "+groupedByName.toString()+"\n");
		
		/**
		 * Goal: group persons' age by it's name
		 */
		Map<String, List<Integer>> ageGrouped = persons.stream().collect(Collectors.groupingBy(Person :: getName, 
																									Collectors.mapping(Person :: getAge, Collectors.toList())));
		System.out.println("Grouped by age: "+ageGrouped.toString()+"\n");
		
		/**
		 * Goal : count of person of the same name 
		 */
		Map<String, Long> namesCount1 = persons.stream().collect(Collectors.groupingBy(Person :: getName, Collectors.counting()));
		System.out.println("Grouped by same names (Long version) : "+namesCount1.toString()+"\n");
		
		Map<String, Integer> namesCount2 = persons.stream().collect(Collectors.groupingBy(Person :: getName, 
																								Collectors.collectingAndThen(Collectors.counting(), Long :: intValue)));
		System.out.println("Grouped by same names (Integer version) : "+namesCount2.toString()+"\n");
	}
}
