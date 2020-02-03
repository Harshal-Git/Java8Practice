/**
 * 
 */
package com.referenceOperatorDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Harshal-Git
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// calling constructor reference
		Car carObj= Car.createCar(Car :: new);
		
		// adding in list
		List<Car> cars = Arrays.asList(carObj);
	
		// calling collide method
		cars.forEach(Car :: collide);
		
		// calling repair method
		cars.forEach(Car :: repair);
		
		// calling follow-up method
		final Car followUp= Car.createCar(Car :: new);
		cars.forEach(followUp :: follow);
	}

}
