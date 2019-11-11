package com.class5;

import java.util.Scanner;

public class Task3 {
	public static void main(String [] args) {
		
		/* write a program that will read 3 inputs of scores(quiz,mid term,and
		 * final score) and determine the grade based on the following rules
		 * if the average score >=90 -->grade=A
		 * if the average score >=70 & <90 -->grade=b
		 * if the average score >=50 & <70 -->grade=C
		 * if the average score <50 -->grade=F
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter quiz score");
		int quiz=scan.nextInt();
		
		
		System.out.println("Please enter mid term score");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		int finalScore=scan.nextInt();
		
		int average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("A");
				
		}else if (average>=70 && average <90) {
		System.out.println("B");
		} else if (average>=50 && average<70){
			System.out.println("C");
		}else if (average<50) {
			System.out.println("F");
		}else {
			System.out.println("Unknown");
		}
		
			
	

	} 

}
