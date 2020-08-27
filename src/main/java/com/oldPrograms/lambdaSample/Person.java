/**
 * 
 */
package com.oldPrograms.lambdaSample;

/**
 * @author Harshal-Git
 *
 */
public interface Person {

	public enum Gender {MALE, FEMALE};
	
	public int getAge();
	
	public String getName();
	
	public Gender getGender();
	
}
