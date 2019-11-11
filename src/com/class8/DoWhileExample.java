package com.class8;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		/*ask user to enter if it's raining or not(true or false)
		 * as long as there is rain let's keep asking
		 * as soon as there is no rain --> you can go the park
		 * 
		 */

		Scanner scan;
		boolean isRain; 
		scan=new Scanner (System.in);
		do {
			System.out.println("It is raining?");
			isRain=scan.nextBoolean();
		}while (isRain) ;
		System.out.println("Go to the park");
	}

}