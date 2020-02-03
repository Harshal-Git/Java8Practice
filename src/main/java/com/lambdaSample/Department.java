/**
 * 
 */
package com.lambdaSample;

import java.util.Set;

/**
 * @author Harshal-Git
 *
 */
public interface Department {

	public enum DepartmentType {SALES, DEVELOPMENT, ACCOUNTS, HR};
	
	public Department.DepartmentType getDepartmentType();
	
	public String getDepartment();
	
	public Manager getManager();
	
	public Set<Employee> getEmployees();
	
}
