package com.class05;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Do you have a credit card? true or false");
		boolean cc=scan.nextBoolean();
		
		if(cc) {
			System.out.println("What is the balance on you card?");
			int balance=scan.nextInt();
			
			if (balance>1000) {
				System.out.println("Please pay off your balance");
			}else {
				System.out.println("You can spend more money");
			}			
		}else {
			System.out.println("Would you like to apply for credit card?");
		}
		
		

		
	}

}
