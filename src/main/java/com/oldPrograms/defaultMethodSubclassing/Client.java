/**
 * 
 */
package com.oldPrograms.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		demoParentImpl();

		demoChildImpl();

		demoOverrideParentImpl();
		
		demoOverrideChildImpl();
	}

	private static void demoOverrideChildImpl() {
		Child overrideChildRef= new OverridingChildImpl();
		// calling default method
		overrideChildRef.welcome();
		System.out.println("Message from - "+overrideChildRef.getLastMessage());		
	}

	private static void demoOverrideParentImpl() {
		Parent overrideParentRef= new OverridingParentImpl();
		// calling default method 
		overrideParentRef.welcome();
		System.out.println("Message from - "+overrideParentRef.getLastMessage());
	}

	private static void demoChildImpl() {
		Child childRef= new ChildImpl();
		// calling default method
		childRef.welcome();
		System.out.println("Message from - "+childRef.getLastMessage());		
	}

	private static void demoParentImpl() {
		Parent parentRef= new ParentImpl();
		// calling default method 
		parentRef.welcome();
		System.out.println("Message from - "+parentRef.getLastMessage());
	}

}
