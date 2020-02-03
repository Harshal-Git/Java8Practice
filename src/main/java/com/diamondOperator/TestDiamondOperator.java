/**
 * 
 */
package com.diamondOperator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Harshal-Git
 *
 */
public class TestDiamondOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// This statement is valid in Java-7 and above all versions - diamond operator
		Map<String, String> dataMap= new HashMap<>();
		
		dataMap.put("ABC", "XYZ");
		
		printLength(dataMap);
		
		/*
		 * This statement will not be valid in Java-7. It will give compilation issue. 
		 */
		printLength(new HashMap<>());
	}

	
	private static void printLength(Map<String, String> map){
		
		if(map != null){
			System.out.println("Size- "+map.size());
		}
		else{
			System.out.println("Size- 0");
		}
	}
}
