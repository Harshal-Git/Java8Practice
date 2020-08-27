/**
 * 
 */
package com.oldPrograms.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> Overriding parent class - extending ParentImpl - providing overridden default method
 */
public class OverridingParentImpl extends ParentImpl{

	@Override
	public void welcome() {
		message("OverridingParent... Hi...!");
	}
}
