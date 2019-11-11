package com.class15;

import java.util.Scanner;

public class StringManiTask {

	public static void main(String[] args) {
		// ask user to enter browser
		//based on the input we say "Your selected browser is "____
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter browser name");
		String browser=scan.nextLine();
		
		// switch case is better to check the equality 
		
		switch (browser.toLowerCase()) {
		case "firefox":
			System.out.println("Executio will be performed on "+browser);
			break; 
		case "chrome":
			System.out.println("Executio will be performed on "+browser);
			break;
		case "ie":
			System.out.println("Executio will be performed on "+browser);
			break;
		case "safari":
			System.out.println("Executio will be performed on "+browser);
			break;
		default :
			System.out.println("plrase enter a valid browser");
		}
		

	}

}
