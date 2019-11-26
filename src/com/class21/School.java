package com.class21;

public class School {
	
	public static void main (String [] args) {
		
		
			Student1.school = "Morning School";
			
			Student1 student0 = new Student1();
			
			student0.displayInfo();
			
			Student1 student1 = new Student1();
			//assigning instance variables
			student1.studentName = "Eric";
			student1.GPA = 3.95;
			
			student1.displayInfo();

			Student1 student2 = new Student1();
			student2.studentName = "Jaime";
			student2.GPA = 3.90;
			Student1.school = "Syntax Technologies";
			
			student2.displayInfo();
			
			System.out.println("student1 again");
			student1.displayInfo();
			
			System.out.println("student0 info");
			student0.displayInfo();
			
//			int hour1 = 3, hour2;
//			hour1 = 4;
//			student1.study(hour1);
			

			
		}

		
	}


