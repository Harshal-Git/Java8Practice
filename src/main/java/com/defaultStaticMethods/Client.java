/**
 * 
 */
package com.defaultStaticMethods;

/**
 * @author Harshal-Git
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// handling "default" methods from interface
		Defaultable defObj1= new DefaultableImpl();
		defObj1.defaultMethod();
		
		Defaultable overObj1= new OverridableImpl();
		overObj1.defaultMethod();
		
		// handling "static" methods from interface
		/*
		 * :: - method reference operator 
		 */
		Defaultable defObj2= Defaultable.createInstance(DefaultableImpl :: new);
		defObj2.defaultMethod();
		
		Defaultable overObj2= Defaultable.createInstance(OverridableImpl :: new);
		overObj2.defaultMethod();
	
	}
}
