/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/**
 * @author Harshal-Git
 *
 *	-> Stream.reduce() operations demo - reduce() allows to produce single result from sequence of elements	
 *
 *		reduce() has 3 parts
 *
 *		1. identity - the starting value - this will be returned as result if stream is empty.
 *		2. accumulator - the only mandatory part : the function (either BiFunction / BinaryOperator)
 *		3. combiner - a function to combine the results when parallelism is used for the operation
 */
public class Demo08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get integer stream of 1 -> 10
		IntStream data1 = IntStream.range(1, 11);
		// find total 1
		System.out.println("Total (1:10) -> "+data1.reduce(0, ((total, newElem) -> (total+newElem)))+"\n");

		// get integer stream of 1 -> 10
		IntStream data2 = IntStream.range(1, 11);
		// find total 2
		System.out.println("Total (1:10) -> "+data2.reduce(0, Integer :: sum)+"\n");
		
		// string array elements - combination of first characters
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"};
		String emptyStr = "";
		// concat first characters of all names
		System.out.println("Initials of all names: "+Arrays.stream(names).reduce(emptyStr, (a, b) -> a.concat("-").concat(b.charAt(0)+emptyStr))+"\n");

		// list of string data
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		System.out.println("Words: "+words.toString());
		
		// string length function - apply() of BiFunction
		BinaryOperator<String> longestData = (str1, str2) -> (str1.length() > str2.length()) ? (str1) : (str2);
		
		// only accumulator version of reduce - which returns Optional
		Optional<String> longestStr = words.stream().reduce(longestData);
		System.out.print("Longest string: ");
		longestStr.ifPresent(System.out :: println);
	}
}
