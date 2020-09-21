/**
 * 
 */
package com.oldPrograms.overloadWithLambda;

/**
 * @author Harshal-Git
 * -> an interface - without extending any base interface (like in case 1)
 * 
 * -> The solution to make this case similar to the first one is to cast the lambda expression argument into respective type.
 *  Then only results will match with the first record.
 */
public interface IntPredicateIn {

	public boolean test(int value);
}
