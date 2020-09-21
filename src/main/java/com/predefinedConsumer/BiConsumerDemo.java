/**
 * 
 */
package com.predefinedConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Harshal-Git
 * 
 *	-> bi-consumer demo
 */
public class BiConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// employee list
		List<Employee> empList = getEmployees();
				
		// consumer for printing employee data
		Consumer<Employee> empPrint = (emp) -> System.out.println(emp.toString());

		// print employee data - before increment
		for(Employee emp : empList) {
			empPrint.accept(emp);
		}
	
		System.out.println();
		
		// consumer for incrementing salary for employees
		BiConsumer<Employee, Double> incrementCon = (empObj, salaryIncr) -> empObj.setSalary(empObj.getSalary()+salaryIncr);
		
		for(Employee emp : empList) {
			
			// increment 
			incrementCon.accept(emp, 500.0);
			
			// print data
			empPrint.accept(emp);
		} 
	}

	/**
	 * @return
	 */
	private static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(10, "AAA", 1100));
		empList.add(new Employee(11, "LLL", 2100));
		empList.add(new Employee(12, "DDD", 3100));
		empList.add(new Employee(13, "UUU", 4100));
		empList.add(new Employee(14, "WWW", 5100));
		return empList;
	}
}

class Employee {

	private int empNo;

	private String empName;

	private double empSalary;
	
	/**
	 * 
	 */
	public Employee(int number, String name, double salary) {
		this.empNo = number;
		this.empName = name;
		this.empSalary = salary;
	}

	public int getEmployeeNumber() {
		return this.empNo;
	}

	public String getEmployeeName() {
		return this.empName;
	}

	public double getSalary() {
		return this.empSalary;
	}
	
	public void setSalary(double val) {
		this.empSalary= val;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Number: "+getEmployeeNumber()+" --> Name: "+getEmployeeName()+" --> earns: "+getSalary();
	}
}