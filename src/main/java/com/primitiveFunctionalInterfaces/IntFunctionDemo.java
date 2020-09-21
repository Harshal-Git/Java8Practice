/**
 * 
 */
package com.primitiveFunctionalInterfaces;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

/**
 * @author Harshal-Git
 *
 *	-> we have to choose an appropriate functional interface
 *		with which we can reduce the possible type conversion 
 *		from primitive to wrapper that will improve the performance. 
 */
public class IntFunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// first approach - to accept primitive type and return wrapper type
		IntFunction<Integer> intFun1 = (num) -> (num*num);
		
		System.out.println("square(12): "+intFun1.apply(12));
		
		// another approach - to return primitive type and accept wrapper type
		ToIntFunction<Integer> intFun2=  (num) -> (num*num);
		
		System.out.println("square(11): "+intFun2.applyAsInt(11));
	}
}
