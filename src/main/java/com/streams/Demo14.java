/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		List<Person> personList = personsList();

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

	private static List<Person> personsList() {
		return Arrays.asList(
				new Person("Sara", Gender.FEMALE, 20),
				new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20),
				new Person("Paula", Gender.FEMALE, 31),
				new Person("Paul", Gender.MALE, 32),
				new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 47),
				new Person("Jill", Gender.FEMALE, 12)
				);
	}
}

// person class
class Person {

	private String name;

	private Gender gender;

	private int age;

	/**
	 * parameterized constructor 
	 */
	public Person(String firstName, Gender gender, int age) {
		setName(firstName);
		setGender(gender);
		setAge(age);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	private void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder= new StringBuilder();
		builder.append(getName()).append(" -- ").
		append(getGender().toString()).append(" -- ").append(getAge());
		return builder.toString();
	}
}

enum Gender {
	MALE,
	FEMALE;
}