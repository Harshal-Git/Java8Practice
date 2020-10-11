/**
 * 
 */
package com.allCommon;

/**
 * @author Harshal-Git
 *
 */
public class Person {

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