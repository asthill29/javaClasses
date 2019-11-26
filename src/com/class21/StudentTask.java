package com.class21;

public class StudentTask {

	
	String studentName;
	int studentID;
	static int numberofStudent;
	
	public void printStudent() {
		System.out.println("The student name is :"+studentName+" the ID is: "+studentID+" and the total of students is "+numberofStudent);
		
	}

	public static void main(String[] args) {
		

		StudentTask stud1 = new StudentTask();
		stud1.studentName="Brenda";
		stud1.studentID= 25;
		stud1.numberofStudent= 450;
		stud1.printStudent();
		
		StudentTask stud2 = new StudentTask();
		stud2.studentName="John";
		stud2.studentID= 98;
		stud2.numberofStudent= 475;
		stud2.printStudent();
		
		StudentTask stud3 = new StudentTask();
		stud3.studentName="Smith";
		stud3.studentID= 105;
		stud3.numberofStudent= 700;
		stud3.printStudent();
		

	}

}
