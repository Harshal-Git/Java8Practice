/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 *	-> using sorting operations for strings
 *			-> first by length and then by natural sorting
 */
public class Demo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare list of string 
		List<String> companies= new ArrayList<>();
		companies.add("Aston Martin");companies.add("Lamborghini");companies.add("Bugatti");
		companies.add("Ferrari");companies.add("Bentley");companies.add("Maserati");
		companies.add("Mercedes");companies.add("Audi");companies.add("BMW");
		
		System.out.println("Companies : \n"+companies.toString());

		// sort companies with length of string 
		Comparator<String> namesLenComp = (name1, name2) -> {
																int len1= name1.length();
																int len2= name2.length();
																return ((len1 < len2) ? (-1) : 						// if length are unequal
																				((len1 > len2) ? (1) : 					// if length are unequal
																					(name1.compareTo(name2)))); // if string has same length
														};
														
		// sort data												
		List<String> sortedList = companies.stream().sorted(namesLenComp).collect(Collectors.toList());
		System.out.println("Sorted Companies: \n"+sortedList.toString());
	}

}
