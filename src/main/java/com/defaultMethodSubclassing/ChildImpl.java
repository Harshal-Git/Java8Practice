/**
 * 
 */
package com.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> class implementing the "Child" interface with remaining methods
 */
public class ChildImpl implements Child{

	private String message;
	
	@Override
	public void message(String body) {
		this.message= body;
	}

	@Override
	public String getLastMessage() {
		return this.message;
	}

	
}
