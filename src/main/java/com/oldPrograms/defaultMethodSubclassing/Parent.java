/**
 * 
 */
package com.oldPrograms.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> interface with a default method to be used by implenenting classes
 */
public interface Parent {

	public void message(String body);
	
	/**
	 * default method with a hard coded message
	 */
	public default void welcome() {
		message("Parent... Hi..!");
	}
	
	public String getLastMessage();
}
