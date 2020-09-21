/**
 * 
 */
package com.constructorRefOperator;

/**
 * @author Harshal-Git
 * 	
 *	-> basic program to show how to use parameterized constructor reference operator  
 */
public class ConstructorRefDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// interface reference
		/*
		 * this roughly means is that the interface get() method 
		 * is internally referring to the constructor of Sample class
		 */
		Intf2 intRef = Sample2 :: new;
		
		// apply the interface reference and get an object
		Sample2 obj1 = intRef.get("111");
		System.out.println(obj1.toString());
		
		Sample2 obj2 = intRef.get("222");
		System.out.println(obj2.toString());
		
		Sample2 obj3 = intRef.get("333");
		System.out.println(obj3.toString());
		
		Sample2 obj4 = intRef.get("444");
		System.out.println(obj4.toString());
	}
}

// a sample class
class Sample2 {
	
	/**
	 * 
	 */
	public Sample2(String data) {
		System.out.println("Sample2 class constructor called with- "+data);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Object code: "+this.hashCode();
	}
}

interface Intf2 {
	
	// interface method - returns the class
	public abstract Sample2 get(String data);
}
