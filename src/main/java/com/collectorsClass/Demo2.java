/**
 * 
 */
package com.collectorsClass;

import java.util.List;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 *	-> some more methods on Collectors class
 */
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * goal : get comma separated names of people which are older than 30 years
		 */
		List<Person> persons = InterfacePersonData.personsList();

		/*
		 * imperative approach
		 */
		String data = "";
		
		for(Person p : persons) {
			if(p.getAge() > 30) {
				data += p.getName().toUpperCase()+", ";
			}
		}
		// print data (with unnecessary additional ',' at the end)
		System.out.println("Imperative approach: "+data);
		
		/*
		 * functional approach
		 */
		// print the data
		System.out.println("Functional approach: "+persons.stream().filter(person -> person.getAge() > 30).
																									map(Person :: getName).
																									map(String :: toUpperCase).
																									collect(Collectors.joining(", ")));
	}

}
