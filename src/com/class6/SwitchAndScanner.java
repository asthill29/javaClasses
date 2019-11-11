package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/* ask user to enter their gender F or M
		 * base on the input 
		 * if F -- female
		 * if M -- male
		 * otherwise --- unknown
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your gender: F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch (gender) {
		
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender="Male";
			break;
			default:
				userGender="Unknown";
				
		}
		
		System.out.println("Your gender is "+userGender);
		
		
		
	}

}
