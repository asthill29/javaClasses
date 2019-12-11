package com.class27;

public class StudentTest1 {

	public static void main(String[] args) {
	
			SyntaxStudent1 ss=new SyntaxStudent1();
			ss.studyy();
			//ss.doHomework();ce: not visible since method inside child is private
			ss.attendClasses();
			ss.research();
			
			Student1 student=new SyntaxStudent1();
			student.studyy();
			student.research();
			student.attendClasses();
			//student.doHomework();ce: not visible since method inside parent is private
	}

}
