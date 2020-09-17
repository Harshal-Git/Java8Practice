/**
 * 
 */
package com.predefinedFunction;

import java.util.function.Function;

/**
 * @author Harshal-Git
 *
 *	-> 
 */
public class FunctionChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// return double of the number - Function 1
		Function<Integer, Integer> f1 = (num) -> (num*2);
		
		// return cube value of the number - Function 2
		Function<Integer, Integer> f2 = (num) -> (num*num*num);
		
		// check function by changing the sequence
		System.out.println("Double & Cube (2): "+f1.andThen(f2).apply(2));
		
		System.out.println("Cube & Double (2): "+f1.compose(f2).apply(2));
		
	}
}
