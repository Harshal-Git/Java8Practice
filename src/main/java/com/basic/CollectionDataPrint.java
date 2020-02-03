/**
 * 
 */
package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		// anonymous impl way - forEach accepts Consumer functional interface
		Consumer<String> consumerFun = new Consumer<String>() {

			@Override
			public void accept(String data) {
				System.out.print(data);
			}
		};
		
		// print each element from given list 
		System.out.print("First print with anonymous impl : ");
		Arrays.asList(data).forEach(consumerFun);

		System.out.println();
		
		System.out.print("Second print with lambda : ");
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
		
		// filter data of length > 3 and print it's length
		Arrays.stream(txt)
				.filter(s -> s.length() > 3)
				.map(s -> s.length())
				.forEach(l -> System.out.print(l+" "));

		System.out.println();
		
		// convert given data stream into upper case
		List<String> upperCase= Stream.of("hello", "world", "there", "is","a","first","stream").
															map(val -> val.toUpperCase()).
															collect(Collectors.toList());
		System.out.println("Upper case list: "+upperCase.toString());
		
		// find data from the stream which starts with a digit
		List<String> digitStr= Stream.of("ab", "1ac", "11cb", "bw1", "", "0", "p").
														filter(initialVal -> initialVal.length() > 0). // to filter out the strings with length > 0
														filter(initialVal -> isDigitAtStart(initialVal.charAt(0))).	// to filter the strings having first char as digit
														collect(Collectors.toList());
		System.out.println("Digit starting data: "+digitStr.toString());
		
		// flatmap example (combine streams and provide a single stream) 
		List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).
															flatMap(numbers -> numbers.stream()).
															collect(Collectors.toList());
		System.out.println("Combined list- "+together.toString());
	}

	
	private static List<Integer> asList(int i, int j) {
		return Arrays.asList(i, j);
	}

	// method to check whether current character is digit OR not
	private static boolean isDigitAtStart(char charAt) {
		return ((charAt >= '0') && (charAt <= '9'));
	}
}
