/**
 * 
 */
package com.interfaceStaticMethod;

/**
 * @author Harshal-Git
 *
 *	-> static methods of any interface are not available for interface implementing classes
 *	
 *	-> Interface static methods cannot be overridden by implementing classes. 
 *			But can be overloaded within same interface.
 */
public class Test0 implements Int1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* valid options */
		Int1.m1();
		
		/* invalid options */
		
		// 1
		//m1();
		
		// 2
		/*Test0 tst0 = new Test0();
		tst0.m1();*/
		
		// 3
		//Test0.m1();
	}
}

interface Int1 {
	/**
	 * m1() of Int1 interface
	 */
	public static void m1() {
		System.out.println("static m1() inside Int1 ");
	}
}