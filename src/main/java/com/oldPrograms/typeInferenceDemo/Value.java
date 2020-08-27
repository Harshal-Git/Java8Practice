/**
 * 
 */
package com.oldPrograms.typeInferenceDemo;

/**
 * @author Harshal-Git
 *
 */
public class Value<T> {

	// a default value method - always returns false
	public static <T> T getDefaultValue() {
		return null;
	}
	
	// method to return - either given value (if not null) OR default (which is always null)
	public T getValORDefault(T obj, T defaultValue) {
		return (obj !=null ? obj : defaultValue);
	}
}
