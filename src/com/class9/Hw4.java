package com.class9;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
	
		
		
		 int secretNumber = 12;
		 int guessNumber;

		Scanner scan=new Scanner (System.in);
		
		do {
			System.out.println("Please guess my number from 1 to 20");	
			guessNumber=scan.nextInt();
			
			if (guessNumber<secretNumber) {
				System.out.println("Number is too small");	
			}else if (guessNumber>secretNumber){
				System.out.println("Number is too large ");	
			}else {
				System.out.println("Congratulations you got it");	
			}
		}while (guessNumber != secretNumber);
		
		
		

		
	
					
			}

		

	}


