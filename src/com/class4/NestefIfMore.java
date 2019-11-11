package com.class4;

public class NestefIfMore {

	public static void main(String[] args) {
		/* check age, If ages is less than 16 --> you are too young to drive
		 * otherwise --> you are eligible to drive & we will check 
		 * if you are older than 18-->
		 * you can get a driver license and if not can get a learner permit
		 */
		
		int age=55;
		
		if (age<16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are eligible to drive");
			if (age>=18) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents to drive");
			}
		}
		System.out.println("***************************");
		/* we need to check if students completed the quiz
		 * if yes--> good job, If not --> not good
		 * if they completed we will check score:
		 * if more that 90 --> got an A
		 *  if more that 80 --> got an B
		 *  anything bellow --> you should study more*/
		 
		
		boolean quiz=true;
		int score=80;
		
		if (quiz) {
			System.out.println("Good Job!!!");
			if (score>=90) {
				System.out.println("You got an A");
			} else if (score>=80) {
				System.out.println("You go a B");
			}else {
				System.out.println("You should study more");
			}
			
		}else {
			System.out.println("Not Good!!!");
			
		}
		
		
		
		
		
	}

}
