/**
 * 
 */
package com.defaultMethodMultipleInheritance;

/**
 * @author Harshal-Git
 *	
 *	-> Multiple inheritance is possible in Java via interface for non-default / non-static methods
 */
public class Test0 implements Int1, Int2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test0 tstObj = new Test0();
		tstObj.m1();
	}

	/* (non-Javadoc)
	 * @see com.defaultMethodMultipleInheritance.Int1#m1()
	 */
	@Override
	public void m1() {
		System.out.println("m1() overridden in Test0 Class");
	}
}

interface Int1 {
	/**
	 * m1() of Int1
	 */
	public abstract void m1();
}

interface Int2 {
	/**
	 * m1() of Int2
	 */
	public abstract void m1();
}