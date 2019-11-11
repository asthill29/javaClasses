package com.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		for (int i=1; i<=50; i++) {
			if (i % 3 == 0 ) {
				continue;
			}
			System.out.println(i);
		}

		
		//task2
		System.out.println("************");
		Scanner scan=new Scanner (System.in);
		boolean creditCard;
		
		for (int a=1; a<=10; a++) {
			System.out.println("Do you want to apply for a credit card?");
			creditCard=scan.nextBoolean();
			if(creditCard) {
				break;
		}
	}
}
}
