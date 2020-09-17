/**
 * 
 */
package com.predefinedFunction;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Harshal-Git
 *
 */
public class FunctionBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// square function
		Function<Integer, Integer> squareFun = (data) -> (data*data);
		System.out.println("square(6): "+squareFun.apply(6));
		System.out.println("square(4): "+squareFun.apply(4));
		System.out.println("square(9): "+squareFun.apply(9));

		// string length function - input string, return length
		Function<String, Integer> strLen = (data) -> data.length();
		System.out.println("length(this is test program): "+strLen.apply("this is test program"));
		System.out.println("length(hello world): "+strLen.apply("hello world"));

		// String null check predicate
		Predicate<String> nullCheck = (data) -> (data == null);

		// string upper case function - combined with null check predicate
		Function<String, String> upperCaseFun = (data) -> nullCheck.negate().test(data) ? data.toUpperCase() : "";
		
		System.out.println("upperCase(this is test program): "+upperCaseFun.apply("this is test program"));
		System.out.println("upperCase(null): "+upperCaseFun.apply(null));
	}

}
