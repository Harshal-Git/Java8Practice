/**
 * 
 */
package com.lambdaExpBasics;

/**
 * @author Harshal-Git
 *
 *	-> demo of an functional interface implementation w.r.t 
 *
 *		a. concrete class implementation
 *		b. anonymous interface implementation
 *		c. lambda expression 
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// via concrete class implementation
		Impl1 implObj = new Impl1();
		System.out.println("square(10)= "+implObj.square(10));

		// via interface reference and class object
		Square1 implObj2 = new Impl1();
		System.out.println("square(15)= "+implObj2.square(15));

		// via anonymous implementation
		Square1 intObj1 = new Square1() {
			@Override
			public int square(int data) {
				return (data*data);
			}
		};
		System.out.println("square(20)= "+intObj1.square(20));

		// lambda expression
		Square1 intObj2 = (data) -> data*data;
		System.out.println("square(25)= "+intObj2.square(25));
	}
}

//interface 
interface Square1 {
	public abstract int square(int data);
}

//concrete implementation class
class Impl1 implements Square1{

	/* (non-Javadoc)
	 * @see com.lambdaExpBasics.SquareI#square(int)
	 */
	@Override
	public int square(int data) {
		return data*data;
	}
}