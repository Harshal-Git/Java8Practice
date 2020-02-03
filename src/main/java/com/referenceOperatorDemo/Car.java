/**
 * 
 */
package com.referenceOperatorDemo;

import java.util.function.Supplier;

/**
 * @author Harshal-Git
 *
 */
public class Car {

	// static method for this class to return a new instance
	public static Car createCar(Supplier<Car> defName) {
		return defName.get();
	}
	
	// static method
	public static void collide(final Car carObj) {
		System.out.println("Collided car: "+carObj.toString());
	}
	
	// normal method
	public void follow(final Car carObj) {
		System.out.println(carObj.toString()+" follow-up...");
	}
	
	// normal method
	public void repair() {
		System.out.println(this.toString()+" repaired.");
	}
}
