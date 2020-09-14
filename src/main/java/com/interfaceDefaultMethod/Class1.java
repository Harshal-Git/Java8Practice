/**
 * 
 */
package com.interfaceDefaultMethod;

/**
 * @author Harshal-Git
 *
 *	-> program to show usage default methods
 *
 *		1. Interface implementing class does not need to give implementation for the "default" method. 
 *				It won't result in any type of compilation issue.
 *
 *		2. These method are accessible via interface reference and class object OR class reference and class object.
 *
 *		3. Methods of "java.lang.Object" class cannot be used as default methods inside any interface.
 */
public class Class1 implements Interf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// class reference and class object can call default methods. And if they want, they can override "default" methods.
		System.out.println("Class reference and class object...");
		Class1 classObj = new Class1();
		classObj.m1();
		classObj.m2();
		classObj.m3();
		
		// interface reference can call such default methods.
		System.out.println("\nInterface reference and class object...");
		Interf interfaceObj = new Class1();
		interfaceObj.m1();
		interfaceObj.m2();
		interfaceObj.m3();
	}

	/* (non-Javadoc)
	 * @see com.interfaceDefaultMethod.Interf#m1()
	 */
	@Override
	public void m1() {
		System.out.println("m1() from Class1");
	}

	/* (non-Javadoc)
	 * @see com.interfaceDefaultMethod.Interf#m2()
	 */
	@Override
	public void m2() {
		System.out.println("m2() from Class1");
	}
	
	/* (non-Javadoc)
	 * @see com.interfaceDefaultMethod.Interf#m3()
	 */
	@Override
	public void m3() {
		System.out.println("m3() from Class1");
		
		// way to call interface default version 
		Interf.super.m3();
	}
}
