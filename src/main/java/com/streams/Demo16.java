/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Harshal-Git
 *
 *	-> a good example to understand how stream operations are performed.
 *
 *	-> Composing all intermediate operations into a single pipeline - ready to be triggered.
 *	-> Once the terminal operation is called, composed function is used upon each element.
 *	-> If this composed function fails on any data, immediately next element is being picked and process is restarted.
 *	-> And if function passes, successful elements are resulted / collected.
 *
 * ->  see how for each number, functions are getting called.
 */
public class Demo16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// data list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

		// aim: given an ordered (remember: Ordered & not sorted) list, 
		// find double of the first even number greater than 3
		Optional<Integer> firstEvenDoubledNum = numbers.stream().
																				filter(Demo16 :: isGT3).
																				filter(Demo16 :: isEven).
																				map(Demo16 :: getDouble).
																				findFirst();
		// print result
		System.out.println("Result: "+firstEvenDoubledNum.get().intValue());
	}

	private static boolean isGT3(int num) {
		System.out.println("isGT3 -> "+num);
		return (num > 3);
	}
	
	private static boolean isEven(int num) {
		System.out.println("isEven -> "+num);
		return (num % 2 == 0);
	}
	
	private static int getDouble(int num) {
		System.out.println("getDouble -> "+num);
		return (num * 2);
	}
}
