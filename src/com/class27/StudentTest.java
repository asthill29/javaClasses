package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj=new SyntaxStudent();
		obj.study();
		obj.quiz();
		//obj.code();
		System.out.println("--------------");
		
		Student obj1=new CollegeStudent();
		obj1.study();
		obj1.quiz();
		//obj1.bachelor();
		System.out.println("--------------");
		
		Student obj2=new SchoolStudent();
		obj2.study();
		obj2.quiz();
		//obj2.learn();
		
		
		
	}

}
