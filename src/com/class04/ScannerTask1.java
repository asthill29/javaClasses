package com.class04;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String cityName=scan.next();
		
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temperature inthe city of  "+cityName+" is "+convertedTemp);
		

	}

}
