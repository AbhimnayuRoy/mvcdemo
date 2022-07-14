package com.love2code.mvcdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		
		//create an empty list
		List<Student> students = new ArrayList<>();
		
		//add sample data
		students.add(new Student("Abhimanyu" , "Roy","abhiman@love2code.com"));
		students.add(new Student("Arit" , "Ghosh","arit@love2code.com"));
		students.add(new Student("Abhijit" , "Launda","abhijit@love2code.com"));
		//return the list
		return students;
	}
}
