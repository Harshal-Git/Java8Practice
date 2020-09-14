/**
 * 
 */
package com.lambdaExpCustomClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Harshal-Git
 *
 *	-> how lambda expression is used with custom class for spepcific operations 
 */
public class CustomClassDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare a collection of employee objects
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("John", 11));
		empList.add(new Employee("James", 17));
		empList.add(new Employee("Kate", 52));
		empList.add(new Employee("Victor", 88));
		empList.add(new Employee("Tom", 24));
		empList.add(new Employee("Tim", 33));

		// print current data
		System.out.println("Employees: \n"+empList);

		// sort these employee w.r.t Employee number
		Collections.sort(empList, (emp1, emp2) -> {
				return (emp1.getEmpNo() < emp2.getEmpNo()) ? (-1) : 
								((emp1.getEmpNo() > emp2.getEmpNo() ? (1) : (0)));
		});

		// print the sorted list
		System.out.println("Sorted Employees based on number: \n"+empList);
		
		// sort these employees w.r.t alphabetical order
		Collections.sort(empList, (emp1, emp2) -> {
											return (emp1.getEmpName().compareTo(emp2.getEmpName()));
		});

		// print the sorted list
		System.out.println("Sorted Employees based on alphabetical order: \n"+empList);		
	}
}

// custom class - Employee
class Employee {

	private String empName;
	private int empNo;

	/**
	 * parameterized constructor
	 */
	public Employee(String name, int number) {
		this.empName = name;
		this.empNo = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.empNo+":"+this.empName;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}
}