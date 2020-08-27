/**
 * 
 */
package com.oldPrograms.optionalDemo;

import java.util.Optional;

/**
 * @author Harshal-Git
 * -> Program to demonstrate how to use flatMap() to get value of reference path a.b.c.value - where 'a' HAS-A 'b' and 'b' HAS-A 'c' and 'c' contains the actual value.	 
 */
public class OptionalChainingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OptionalChainingDemo classObj= new OptionalChainingDemo();
		classObj.test();
	}

	public void test() {
		A aObj= new A();
		
		System.out.println("Chained value: "+aObj.getB().
																flatMap(B :: getC).
																flatMap(C :: getValue).
																orElse("DEFAULT"));
	}
	
	// Base class C where value is defined
	private class C {
		private String value= "Chained value";
		
		public Optional<String> getValue(){
			return Optional.ofNullable(value);
		}
	}
	
	// Upper class of 'C'- 'B'
	private class B {
		
		private C cObj= new C();
		
		public Optional<C> getC(){
			return Optional.ofNullable(cObj);
		}
	}
	
	// top class of 'B'- 'A'
	private class A {
		
		private B bObj= new B();
		
		public Optional<B> getB(){
			return Optional.ofNullable(bObj);
		}
	}
}
