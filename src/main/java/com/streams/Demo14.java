/**
 * 
 */
package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.allCommon.InterfacePersonData;
import com.allCommon.Person;

/**
 * @author Harshal-Git
 *
 */
public class Demo14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get data
		List<Person> personList = InterfacePersonData.personsList();

		// prepare a map with person name+age as key and person object as value
		Map<String, Person> personsMap= personList.stream().
																	collect(Collectors.toMap(
																			person -> person.getName() + "-" + person.getAge(),
																			person -> person));
		// print data
		System.out.println(personsMap);

		// create a map where name is key & value is person with that name
		Map<String, List<Person>> groupedNamesMap = personList.stream().
																		collect(Collectors.groupingBy(Person :: getName));
		// print data
		System.out.println(groupedNamesMap);
		
		// create a map where name is key & value is ages of the people with that name
		Map<String, List<Integer>> groupedAgeMap = personList.stream().
																		collect(Collectors.groupingBy(Person :: getName, 
																				Collectors.mapping(Person :: getAge, 
																						Collectors.toList())));
		// print data
		System.out.println(groupedAgeMap);
	}
}