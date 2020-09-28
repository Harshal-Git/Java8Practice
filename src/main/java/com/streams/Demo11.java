/**
 * 
 */
package com.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 *	-> demo of Array & Streams inter conversion
 */
public class Demo11 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException, URISyntaxException {

		// 1. Stream from an array, sort and findFirst
		Stream.of("Ava", "Aneri", "Alberto").sorted().	// natural ordering 
				findFirst().
					ifPresent(System.out :: println);
		System.out.println();

		// 2. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names).							// same as Stream.of(names)
			filter(x -> x.startsWith("S")).
				sorted().
					forEach(System.out :: println);
		System.out.println();
		
		// 3. average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10}).
								map(x -> x * x).
									average().
										ifPresent(Demo11 :: printAverage);
		System.out.println();
		
		// 4. Stream from List, filter which are starting with "a" and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people.stream().
			map(String::toLowerCase).
				filter(x -> x.startsWith("a")).
					forEach(System.out :: println);
	}
	
	private static void printAverage(double data) {
		System.out.println("Average: "+data);
	}
}
