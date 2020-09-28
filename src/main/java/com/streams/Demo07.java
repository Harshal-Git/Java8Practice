/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 */
public class Demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> data = new ArrayList<>();
		data.add(1);data.add(2);data.add(3);data.add(4);data.add(5);
		
		System.out.println("List data: "+data.toString());
		
		// convert list stream into an array
		Integer [] dataArr = data.stream().toArray(Integer[] :: new);
		System.out.println("Array data: "+Arrays.toString(dataArr));

		// get array converted into stream and print 
		System.out.println("Array back to stream : ");
		/*
		 * Here, the Integer array is converted into Integer stream. 
		 */
		Stream.of(dataArr).forEach(System.out :: println);
		
		// get array converted into list again
		List<Integer> newData = Stream.of(dataArr).collect(Collectors.toList());
		System.out.println("New list data: "+newData.toString());
	}
}
