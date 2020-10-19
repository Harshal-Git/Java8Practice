/**
 * 
 */
package com.java9.unmodifiableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Harshal-Git
 *
 *	-> Just to show how till Java-8; unmodifiable collections were supposed to be created 
 *		which will throw UnsupportedException if those are altered.
 */
public class CreationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create a list
		List<String> strList = new ArrayList<>();
		strList.add("hello");strList.add("world");strList.add("java");

		// modifiable list
		System.out.println("Modifiable list before change: "+strList.toString());

		// update list
		strList.add("program");

		// modifiable list
		System.out.println("Modifiable list after change: "+strList.toString());		

		// create unmodifiable collection from this list
		strList = Collections.unmodifiableList(strList);

		// unmodifiable list
		System.out.println("Unmodifiable list before change: "+strList.toString());

		// try to add element in unmodifiable list
		try {
			strList.add("this is test");
		}
		catch(UnsupportedOperationException op) {
			System.err.println("Exception raised. Cannot perform modification to Unmodifiable list.\n");
		}

		// unmodifiable list after change
		System.out.println("Unmodifiable list after change: "+strList.toString());
	}
}
