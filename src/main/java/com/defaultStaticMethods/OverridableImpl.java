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
	}
	
	@Override
	public void defaultMethod() {
		//Defaultable.super.nonImplementableMethod();
		System.out.println("defaultMethod() from "+this.getClass().getSimpleName());
	}
}
