/**
 * 
 */
package com.predefinedConsumer;

import java.util.function.Consumer;
import java.util.function.Function;

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
public class ConsumerCustom {

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

		// consumer to print student data
		Consumer<Student> consumerSt = (stObj) -> {
			System.out.println(stObj.toString()
					+" -> Grade: "+gradeFunc.apply(stObj));
		};

		// print grade for each student 
		for(Student st : studentData) {
			consumerSt.accept(st);
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