/**
 * 
 */
package com.oldPrograms.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> child interface - overriding the default method of parent interface
 */
public interface Child extends Parent{

	/**
	 * default welcome() of parent - overridden by child to provide specific implementation 
	 */
	@Override
	default void welcome() {
		message("Child... Hi...!");
	}
}
