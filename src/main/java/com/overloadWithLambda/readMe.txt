As always while methods are overloaded, compiler tries to choose the overloaded method with most specific type for the object passed into the arguments.

But that is not always the case - explained here with different cases. Run both Examples*.java files and see the difference.

Case#1 - more specific interface is constructed by extending the basic one

Interface:	IntegerBiFunction -> extends BinaryOperator

Case#2 - an independent interface is constructed having the same method signature - that's where the compiler will identify the ambiguity. 
As we are not overriding OR overloading a method, compiler treats as 2 different methods with same signature and hence an ambiguity case. 

Interface 1:  IntPredicate 
Interface 2:  Predicate
	
For Case#2, we can remove this ambiguity by type casting the lambda expression into any of the respected interface type.