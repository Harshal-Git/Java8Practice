# Java8Practice
java 8 practice 

-> Practice programs for Java 8 

-> Includes some examples from the book: Java 8 Lambdas by: Richard Warburton
OR refer to the main Gitrepo : https://github.com/RichardWarburton/java-8-lambdas-exercises

-> Some are done for practice and from other reference.

-> Based on some practice - best way to write lambda expression for any functional interface I found as

	1. Separate problem statement in different parts and identify what all methods are needed for stream operation.
	 
	2. Based on methods' arguments decide what anonymous functional implementations are needed and write those.
	
	2. First use functions in methods, and if it founds successful; copy implementations in lambda manner and delete/hide the 
			anonymous function code.

Project specifications:

-> main() methods to execute the code are provided in "*Client.java" class.

-> Maven: Maven structure built with version-3.6.3

-> Java: Project configured for Java 10. Expected java version (7 and above) can be updated in pom.xml file.

	-> Even after importing, if project doesn't compile, change java compiler specifications manually from project properties:
		
			1. Properties -> Java compiler -> Compiler compliance level 
			2. Properties -> Java Build path -> JRE library version