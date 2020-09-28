/**
 * 
 */
package com.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 *	-> demo of IntStream
 */
public class Demo10 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException, URISyntaxException {

		// 1. Prepare an Integer Stream and print the data
		IntStream.range(1, 11).forEach(Demo10 :: print);
		System.out.println("\n");

		// 2. Prepare Integer Stream with some elements skipped and print remaining data
		IntStream.range(1, 10).
					skip(3).													// discards first 'N' elements given 
						forEach(Demo10 :: print);
		System.out.println("\n");

		// 3. Sum of an Integer Stream 
		System.out.println("Sum(1 -> 10): "+IntStream.range(1, 11).sum()+"\n");

		// 4. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary+"\n");
		
		// 5. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (a, b) -> a + b);	// 0.0 - starting value 
																												// a - running total 		
																												// b - next value from stream
		System.out.println("Total = " + Double.valueOf(total).floatValue());
	}

	private static void print(Integer data) {
		System.out.print(data+" ");
	}
}
