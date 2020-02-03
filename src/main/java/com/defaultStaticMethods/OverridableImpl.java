/**
 * 
 */
package com.defaultStaticMethods;

/**
 * @author Harshal-Git
 *
 */
public class OverridableImpl implements Defaultable {

	public OverridableImpl() {
		System.out.println("OverridableImpl constructor called...");
	}
	
	@Override
	public void defaultMethod() {
		//Defaultable.super.nonImplementableMethod();
		System.out.println("defaultMethod() called from overridden definition.");
	}
}
