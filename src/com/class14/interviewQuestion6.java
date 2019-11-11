package com.class14;

import java.util.Scanner;

public class interviewQuestion6 {

	public static void main(String[] args) {
		
	//Write a Java Program to find whether a String is palindrome or not?
	// palindrome is a word that can be read from right to left 
	//and left to right and will sa the same 
	// mom --> reverese is still mom
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter word or sentences");
				String a=sc.next();
				
				char [] aNew=a.toCharArray();
			
				for (int i = 0; i<aNew.length-1 ; i++) {
					if(aNew[i]==aNew[aNew.length-1]) {
						System.out.println("This word is a palindrome");
							break;			
					}
					else {
						System.out.println("This word is not a palindrome");
						break;
					}
				}

	}

}
