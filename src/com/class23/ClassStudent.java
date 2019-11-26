package com.class23;

public class ClassStudent {
	/*Write a java program of Class Students that takes students name 
	 * and 3 subject grades. Inside your class also have a method 
	 * to Calculate Average Grade.Test Student class for 5 different students 
	 * with different marks. Your program should print an average mark 
	 * of each students name.
      NOTE: please use different names for instance and local variables.
	 */
	
	
	String studentName;
	int mathGrade, artGrade, historyGrade;
	
	ClassStudent(String name, int math, int art, int history){
		studentName=name;
		mathGrade=math;
		artGrade=art;
		historyGrade=history;
		
	}
	
	public void AverageGrade() {
		
		int average = (mathGrade+artGrade+historyGrade)/3;
		
		System.out.println(studentName+" has an average grade of "+ average);
		
		
	}
	
	public static void main(String []args) {
		ClassStudent s1=new ClassStudent("John",90,75,80);
		s1.AverageGrade();
		
		ClassStudent s2=new ClassStudent("Paul",90,85,80);
		s2.AverageGrade();
		
		ClassStudent s3=new ClassStudent("David",90,70,80);
		s3.AverageGrade();
		
		ClassStudent s4=new ClassStudent("Smith",96,75,80);
		s4.AverageGrade();
		
		ClassStudent s5=new ClassStudent("Alma",95,75,80);
		s5.AverageGrade();
	}

}
