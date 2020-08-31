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
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// via concrete class implementation
		Impl2 implObj = new Impl2();
		System.out.println("sum(5, 10)= "+implObj.sum(5, 10));

		// via interface reference and class object
		Sum1 implObj2 = new Impl2();
		System.out.println("sum(15, 20)= "+implObj2.sum(15, 20));

		// via anonymous implementation
		Sum1 intObj1 = new Sum1() {
			@Override
			public int sum(int data1, int data2) {
				return (data1+data2);
			}
		};
		System.out.println("sum(25, 30)= "+intObj1.sum(25, 30));

		// lambda expression
		Sum1 intObj2 = (data1, data2) -> (data1+data2);
		System.out.println("sum(35, 40)= "+intObj2.sum(35, 40));
	}
}

//interface 
interface Sum1 {
	public abstract int sum(int data1, int data2);
}

//concrete implementation class
class Impl2 implements Sum1{

	/*
	 * (non-Javadoc)
	 * @see com.lambdaExpBasics.Sum1#sum(int, int)
	 */
	@Override
	public int sum(int data1, int data2) {
		return (data1+data2);
	}
}