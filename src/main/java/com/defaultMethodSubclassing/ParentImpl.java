/**
 * 
 */
package com.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> class implementing the "Parent" interface with remaining methods
 */
public class ParentImpl implements Parent{

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
