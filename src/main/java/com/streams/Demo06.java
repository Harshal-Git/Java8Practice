/**
 * 
 */
package com.streams;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Harshal-Git
 *
 *	-> to show how map can be iterated
 *	
 *	-> forEach() of map accepts BiConsumer functional interface 
 */
public class Demo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// data
		Map<Integer, String> dataMap = new HashMap<Integer, String>();
		dataMap.put(1, "Monkey");dataMap.put(2, "Dog"); dataMap.put(3, "Cat");  
		dataMap.put(4, "Lion");dataMap.put(5, "Tiger");dataMap.put(6, "Bear");

		// iterate via forEach
		dataMap.forEach(Demo06 :: printValue);
	}
	
	/*
	 * method to be used for method reference
	 * - having same arguments only
	 */
	private static void printValue(Integer key, String value) {
		System.out.println("Index: "+key+" -- Animal: "+value);
	}
}
