/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 *
 *	-> basic stream programs
 */
public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare a list 
		List<Integer> dataList = new ArrayList<>();
		
		// put data
		dataList.add(0);dataList.add(10);dataList.add(15);
		dataList.add(20);dataList.add(25);dataList.add(30);
		
		// print data
		System.out.println("Data list: "+dataList.toString());
		
		// predicate to apply to filter method
		Predicate<Integer> evenNum= (num) -> (num%2 == 0);
		
		/*
		 *  filter even numbers - with predicate - with filter()
		 */
		List<Integer> evenNumbers= dataList.stream().filter(evenNum).collect(Collectors.toList());
		System.out.println("Even numbers: "+evenNumbers.toString());
		
		/*
		 *  double every number - with function - with map()
		 */
		// function for doubling a number
		Function<Integer, Integer> doubles= (num) -> (num * 2);
		
		// double all numbers
		List<Integer> doublesList= dataList.stream().map(doubles).collect(Collectors.toList());
		System.out.println("Double numbers: "+doublesList.toString());
	}
}
