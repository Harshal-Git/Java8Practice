/**
 * 
 */
package com.predefinedFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @author Harshal-Git
 * 
 *	-> bi-function demo
 */
public class BiFunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// employee list
		List<Employee> empList = new ArrayList<>();
		
		// function for employee creation
		BiFunction<Integer, String, Employee> empCreateFun = (number, name) -> new Employee(number, name);
		
		// test
		empList.add(empCreateFun.apply(10, "DDD"));
		empList.add(empCreateFun.apply(11, "PPP"));
		empList.add(empCreateFun.apply(12, "RRR"));
		empList.add(empCreateFun.apply(12, "CCC"));
		
		// consumer for printing employee data
		Consumer<Employee> empPrint = (emp) -> System.out.println(emp.toString());

		// print employee data
		for(Employee emp : empList) {
			empPrint.accept(emp);
		}
	}

}
class Employee {
	
	private int empNo;
	
	private String empName;
	
	/**
	 * 
	 */
	public Employee(int number, String name) {
		this.empNo = number;
		this.empName = name;
	}
	
	public int getEmployeeNumber() {
		return this.empNo;
	}
	
	public String getEmployeeName() {
		return this.empName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Number: "+getEmployeeNumber()+" --> Name: "+getEmployeeName();
	}
}