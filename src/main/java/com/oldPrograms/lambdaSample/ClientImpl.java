/**
 * 
 */
package com.oldPrograms.lambdaSample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harshal-Git
 *
 */
public class ClientImpl {

	/*
	 * find all managers of all departments with an employee older than 65
	 */
	public Manager[] findManagers1(Corporation c) {
		List<Manager> result = new ArrayList<>();
		for (Department d : c.getDepartments()) {
			for (Employee e : d.getEmployees()) {
				if (e.getAge() > 65) {
					result.add(d.getManager());
				}
			}
		}
		return result.toArray(new Manager[0]);
	}
	
	public Manager[] findManagers2(Corporation c) {
		
		return c.getDepartments().stream().
															filter(d -> d.getEmployees().stream().
																	map(Employee :: getAge).
																	anyMatch(emp -> emp > 65)).
															map(Department :: getManager).
															toArray(Manager[] :: new);
	}
}
