/**
 * 
 */
package com.defaultStaticMethods;

import java.util.function.Supplier;

/**
 * @author Harshal-Git
 * -> this is intended to be a functional interface - with a default implementation
 */
public interface Defaultable {

	// default method definition at interface level
	default void defaultMethod() {
		System.out.println("defaultMethod() from "+this.getClass().getSimpleName());
	}

	// static method to accept respective class definition in form of supplier - and provide the result from given fuction
	static Defaultable createInstance(Supplier<Defaultable> classDef) {
		return classDef.get();
	}
}
