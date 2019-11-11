package com.class12;

import java.util.Scanner;

public class Task1CorrectWay {

	public static void main(String[] args) {
		
		// corrected way 
		 
				Scanner scan1=new Scanner (System.in);
				String message;	
				System.out.println("Please enter Username");
				 String username1=scan1.nextLine();
				
				 System.out.println("Please enter password");
				 String password1=scan1.nextLine();
				 
				 System.out.println("Please confirm password");
				 String confirmPass1=scan1.nextLine();
				
				 if (!(username1.isEmpty() && password1.isEmpty())) {
					 
					 if (password1.length()>8) {
						 
						 if (!password1.contains(username1)) {
							 
							 if (password1.equals(confirmPass1)) {
								 message="Your username and password has been created";
							 }else {
								 message="Passwords do not match";
							 }
							 
	
						 }else {
							 message="Password cannot contain username";
						 }
						 
						 
						 
					 }else {
						 message="Password is too short";
					 }
					 
					 
				 }else {
					message = "Username and password cannot be empty"; 
				 }
				
				 System.out.println(message);
		
			

	}

}
