package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		
	System.out.println("Please enter Username");
	 String username=scan.nextLine();
	
	 System.out.println("Please enter password");
	 String password=scan.nextLine();
	 
	 System.out.println("Please confirm password");
	 String confirmPass=scan.nextLine();
		 
		 if (username.isEmpty()) {
			 System.out.println("Username and password cannot be empty");
		 } else if (password.isEmpty()) {
			 System.out.println("Username and password cannot be empty");	 
		 }else if (password.length()<8) {
			 System.out.println("Password is too short");
		 }else if (password.contains(username)) {
			 System.out.println("Password cannot contain username");
		 }else if (!password.equals(confirmPass)) {
			 System.out.println("Password do not match");
		 }else {
			 System.out.println("Your username and password has been created");
		 }
		
		

	}

}
