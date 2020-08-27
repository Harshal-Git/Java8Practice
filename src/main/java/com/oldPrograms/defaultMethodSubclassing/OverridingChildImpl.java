/**
 * 
 */
package com.oldPrograms.defaultMethodSubclassing;

/**
 * @author Harshal-Git
 * -> this is the important part - this will extend Child interface and extend "OverridingParentImpl" and will not override any method
 * 
 * --> "extends" class will always comes first and then "implements" interface. [Order is important]
 */
public class OverridingChildImpl extends OverridingParentImpl implements Child {

}
