/**
 * 
 */
package com.allCommon;

import java.util.Arrays;
import java.util.List;

/**
 * @author Harshal-Git
 *
 */
public interface InterfacePersonData {

	/**
	 * returns list of Person
	 */
	public static List<Person> personsList() {
		return Arrays.asList(
				new Person("Sara", Gender.FEMALE, 20),
				new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20),
				new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32),
				new Person("Jack", Gender.MALE, 3),
				new Person("Jack", Gender.MALE, 72),
				new Person("Jill", Gender.FEMALE, 11)
				);
	}
}
