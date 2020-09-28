/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Harshal-Git
 *
 *	-> min() & max() examples
 */
public class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare data
		List<Integer> data = new ArrayList<>();
		data.add(6);data.add(12);data.add(9);data.add(15);data.add(3);data.add(10);data.add(0);

		System.out.println("Numbers: "+data.toString());
		
		// print min & max data (with natural sorting order - ascending)
		Comparator<Integer> c1 = (num1, num2) -> num1.compareTo(num2);
		
		// get min() & max()
		System.out.println("\nASC: "+" Min-> "+data.stream().min(c1).get()+", Max-> "+data.stream().max(c1).get());
		
		// print min & max data (with natural sorting order - descending)
		Comparator<Integer> c2 = (num1, num2) -> num2.compareTo(num1);
		
		// get min() & max()
		System.out.println("\nDESC: "+" Min-> "+data.stream().min(c2).get()+", Max-> "+data.stream().max(c2).get());
	}

}
