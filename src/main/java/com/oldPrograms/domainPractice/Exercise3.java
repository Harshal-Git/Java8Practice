/**
 * 
 */
package com.oldPrograms.domainPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Harshal-Git
 * 
 * -> Count the number of lower case letters in a String.
 * 
 * -> Find the String with the largest number of lower case letters from a List<String>. You can return an Optional<String> to account for the empty list case.
 */
public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Optional<String> largestString= largestString(Arrays.asList("Harshal-Git", "Count the number of lower case letters in a String", 
				"Find the String with the largest number", "of lower case letters from a List<String>", "You can return an Optional<String>", 
				"to account for the empty list case", "public static void main(String[] args) {"));

		if(largestString.isPresent()) {
			System.out.println("Largest String- "+largestString.get());
		}
		else {
			System.out.println("Incorrect input data.");
		}
		
	}

	/**
	 * to iterate over complete string list and identify max length string
	 * This was a bit tricky and didn't expected to re-use the same method which was simply used to find count
	 * 
	 * Hint - Comparator.comparing() 
	 * 
	 * @param dataList
	 * @return largest optional string 
	 */
	private static Optional<String> largestString(List<String> dataList) {
		return dataList.stream().max(Comparator.comparing(Exercise3 :: countLowerChars));
	}
	
	/**
	 * to count lower characters from a given string
	 * @param str
	 * @return - number of lower characters
	 */
	private static int countLowerChars(String str) {
		//return (int) str.chars().filter(charVal -> (charVal >= 'a' && charVal <= 'z')).count();
		
		int length= (int) str.chars().filter(Character :: isLowerCase).count();
		//System.out.println("String- "+str+" --> Length: "+length);
		return length;
	}
}
