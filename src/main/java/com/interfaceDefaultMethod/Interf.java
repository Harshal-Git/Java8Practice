/**
 * 
 */
package com.interfaceDefaultMethod;

/**
 * @author Harshal-Git
 *
 */
public interface Interf {

	public abstract void m1();
	
	public abstract void m2();
	
	public default void m3() {
		System.out.println("m3() from Interf");
	}
	
	/**
	 *  Compilation error
	 *  
	 *  Methods of "java.lang.Object" class cannot be used as 
	 *  default methods inside any interface.
	 */
	/*default int hashCode() {
		return 10;
	}*/
}
