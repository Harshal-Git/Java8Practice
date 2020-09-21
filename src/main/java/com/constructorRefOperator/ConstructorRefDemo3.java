/**
 * 
 */
package com.constructorRefOperator;

/**
 * @author Harshal-Git
 * 	
 *	-> if multiple constructors are present, the only constructor will be called 
 *		which has matching the signature of the interface method.
 */
public class ConstructorRefDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// interface reference
		/*
		 * this roughly means is that the interface get() method 
		 * is internally referring to the constructor of Sample class
		 */
		Intf3 intRef = Sample3 :: new;
		
		// apply the interface reference and get an object
		Sample3 obj1 = intRef.get("111");
		System.out.println(obj1.toString());
		
		Sample3 obj2 = intRef.get("222");
		System.out.println(obj2.toString());
		
		Sample3 obj3 = intRef.get("333");
		System.out.println(obj3.toString());
		
		Sample3 obj4 = intRef.get("444");
		System.out.println(obj4.toString());
	}
}

// a sample class
class Sample3 {
	
	/**
	 * no-args constructor 
	 */
	public Sample3() {
		System.out.println("Sample3 class constructor called.");
	}
	
	/**
	 * parameterized
	 */
	public Sample3(String data) {
		System.out.println("Sample3 class constructor called with- "+data);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Object code: "+this.hashCode();
	}
}

interface Intf3 {
	
	// interface method - returns the class
	public abstract Sample3 get(String data);
}
