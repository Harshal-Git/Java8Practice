/**
 * 
 */
package com.collectorsClass;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some more examples 
 */
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get person data
		List<Person> persons = InterfacePersonData.personsList();
		
		/**
		 * goal: get list of persons having odd & even age
		 */
		
		/*
		 * Primary approach : streaming the collection twice by putting appropriate filter to 
		 * get even & odd ages in different collections. 
		 */
		List<Person> evenAged = persons.stream().filter(person -> person.getAge() % 2 == 0).collect(Collectors.toList());
		List<Person> oddAged = persons.stream().filter(person -> person.getAge() % 2 != 0).collect(Collectors.toList());
		System.out.println("Even aged person: "+evenAged.toString());
		System.out.println("Odd aged person: "+oddAged.toString());

		System.out.println("\n");
		
		/*
		 * Approach 2: partitioning method
		 * Based on given predicate; partitioning method will prepare a map where the key 
		 * will be predicate value (TRUE / FALSE) and the value will be collection of person 
		 * based on whether they are passed OR failed for the given predicate.
		 */
		Map<Boolean, List<Person>> partitionedData =  persons.stream().collect(
																Collectors.partitioningBy(person -> person.getAge() % 2 == 0));
		
		// if we want to drill down the partitioned data, we need to find the internal collection of the above map based on keys
		System.out.println("Even aged people: "+partitionedData.get(true));
		System.out.println("Odd aged people: "+partitionedData.get(false));
	}

}
