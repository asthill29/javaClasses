package com.class19;

public class Task {

	
	String createEmail (String name, String lastName) {
		
		String email=name+lastName;
		
		return email;
	}
	
	boolean isPrime (int num) {
		
		boolean prime=true;
		for (int i=2; i<num; i++) {
			if (num % i ==0) {
				prime=false;
				break;
			}
		}
		
		return prime;
	}

	
	char getGrade (int score) {
		
		char grade;
		
		if (score >=90) {
			grade='A';
		}else if (score >=80) {
			grade='B';
		}else if (score >=70) {
			grade='C';
		}else if (score >=50) {
			grade='D';
		}else {
			grade='F';
		}
		
		
		return grade;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Task task1=new Task ();
		String result=task1.createEmail("john", "snow");
		System.out.println(result+"@gmail.com");
		
		System.out.println("-------");
		
		Task task2=new Task ();
		boolean result1=task2.isPrime(5);
		System.out.println(result1);
		
		System.out.println("-------");
		
		Task task3=new Task ();
		char result2=task3.getGrade(90);
		char result3=task3.getGrade(85);
		System.out.println(result2);
		System.out.println(result3);
	}

}
