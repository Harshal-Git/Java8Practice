/**
 * 
 */
package com.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Harshal-Git
 *
 */
public class CollectionDataPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String data []= {"a", "b", "c", "d"};

		// print each element from given list 
		System.out.print("First print: ");
		Arrays.asList(data).forEach( e -> System.out.print(e));

		System.out.println();

		String separator= "-";

		// other variants (for single line)
		// if body is complex; curly braces can be included to complete the method body
		// lambda may refer class members and local variables (separator) - making them explicitly final
		System.out.print("Second print: ");
		Arrays.asList(data).forEach( (String e) -> System.out.print(e+separator));

		System.out.println();

		System.out.println("Original data: "+ Arrays.toString(data));

		String[] txt = {"State","of","the","Lambda","Libraries","Edition"};
		
		System.out.println(Arrays.toString(txt)+" stream applied: ");
		
		Arrays.stream(txt)
				.filter(s -> s.length() > 3)
				.map(s -> s.length())
				.forEach(l -> System.out.println(l));

	}
}
