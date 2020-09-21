/**
 * 
 */
package com.constructorRefOperator;

/**
 * @author Harshal-Git
 * 	
 *	-> basic program to show how to use constructor reference operator
 */
public class ConstructorRefDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// interface reference
		/*
		 * this roughly means is that the interface get() method 
		 * is internally referring to the constructor of Sample class
		 */
		Intf1 intRef = Sample :: new;
		
		// apply the interface reference and get an object
		Sample obj1 = intRef.get();
		System.out.println(obj1.toString());
		
		Sample obj2 = intRef.get();
		System.out.println(obj2.toString());
		
		Sample obj3 = intRef.get();
		System.out.println(obj3.toString());
		
		Sample obj4 = intRef.get();
		System.out.println(obj4.toString());
	}
}

// a sample class
class Sample {
	
	/**
	 * 
	 */
	public Sample() {
		System.out.println("Sample class constructor called");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Object code: "+this.hashCode();
	}
}

interface Intf1 {
	
	// interface method - returns a class
	public abstract Sample get();
	
}
