/**
 * 
 */
package com.defaultMethodMultipleInheritance;

/**
 * @author Harshal-Git
 *
 *	-> In case of multiple inheritance with default methods:
 *		
 *		either we can choose to ignore all existing default methods in all interface and provide a new body inside the implementing class.
 *
 *		OR we can override any of the interface method and we can call any interface method directly as per the need.
 */
public class Test1 implements Left, Right{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
	}

	@Override
	public void m1() {
		
		// in case no interface default methods are needed.
		System.out.println("m1() from Test1 class - no interface known");
		
		// call specific interface "Left" method
		Left.super.m1();

		// call specific interface "Right" method
		Right.super.m1();
	}
}


interface Left {
	/**
	 * from Left interface
	 */
	default public void m1() {
		System.out.println("m1() from Left interface...");
	}
}

interface Right {
	/**
	 * from Right interface
	 */
	default public void m1() {
		System.out.println("m1() from Right interface...");
	}
}