1. TestDiamondOperator.java

This is to show how diamond operator '<>' - type inference is behaving in Java-7 and above versions with one catch. 

Reason for the compilation issue: 
At the time of creating a new object directly in the method call, instead of compiler taking it as method arguments type, it will refer as "java.lang.Object" type.
So it will give message like:

"The method printLength(Map<String,String>) in the type TestDiamondOperator is not applicable for the arguments (HashMap<Object,Object>)" 
