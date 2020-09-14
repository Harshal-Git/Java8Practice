/**
 * 
 */
package com.interfaceStaticMethod;

/**
 * @author Harshal-Git
 *
 *	-> As from java 8 onwards, static methods are allowed inside interface, 
 *		we can provide main() method also inside the interface.
 */
public interface InterfaceMain {

	public static void main(String[] args) {
		System.out.println("Main() method inside an interface.");
	}
	
}
