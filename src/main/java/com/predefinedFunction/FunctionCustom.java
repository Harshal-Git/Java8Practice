/**
 * 
 */
package com.predefinedFunction;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Harshal-Git
 *
 *	-> return student grade based on the marks
 *
 *		marks:
 *		>= 80 --> A
 *		>= 60 --> B
 *		>= 50 --> C
 *		>= 35 --> D
  *		<   35 --> F
 */
public class FunctionCustom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// grade function
		Function<Student, String> gradeFunc = (stObj) -> {
																		int marks = stObj.marks;
																		if(marks >= 80) return "A";
																		else if(marks < 80 && marks >= 60) return "B";
																		else if(marks < 60 && marks >= 50) return "C";
																		else if(marks < 50 && marks >= 35) return "D";
																		else return "F";
																	};
		
		// student data 
		Student [] studentData = {
													new Student("AAA", 66),
													new Student("BB", 100),
													new Student("JJJ", 55),
													new Student("PPQX", 45),
													new Student("ZZY", 25)
												};
																	
		// print grade for each student 
		for(Student st : studentData) {
			System.out.println(st.toString()+" -> Grade: "+gradeFunc.apply(st));
		}
		
		System.out.println("\n");
		
		// predicate to display students only with marks >= 50
		Predicate<Student> marksPredicate = (studentObj) -> (studentObj.marks >= 50);
		
		// show students only >= 50
		for(Student st : studentData) {
			if(marksPredicate.test(st)) {
				System.out.println(st.toString());
			}
		}
	}
}


class Student {
	
	String name;
	int marks;
	
	/**
	 * 
	 */
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name: "+this.name+" -> Marks: "+this.marks;
	}
}