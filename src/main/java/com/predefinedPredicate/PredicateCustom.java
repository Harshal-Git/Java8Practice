/**
 * 
 */
package com.predefinedPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Harshal-Git
 *
 */
public class PredicateCustom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare Employees data
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("One", 1000));
		empList.add(new Employee("Two", 1200));
		empList.add(new Employee("Four", 6000));
		empList.add(new Employee("Nine", 3500));
		empList.add(new Employee("Six", 7000));
		empList.add(new Employee("Eleven", 3000));

		// salary >= 3500
		Predicate<Employee> pred1 = (empObj) -> (empObj.getSalary() >= 3500); 

		for (Employee employee : empList) {
			if(pred1.test(employee)) {
				System.out.println(employee.toString());
			}
		}
	}
}

class Employee {

	private String name;

	private double salary;

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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	private void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 
	 */
	public Employee(String name, double salary) {
		setName(name);
		setSalary(salary);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName()+" -> "+getSalary();
	}
}