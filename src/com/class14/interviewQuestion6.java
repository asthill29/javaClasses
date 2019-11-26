package com.class14;

import java.util.Scanner;

public class interviewQuestion6 {

	public static void main(String[] args) {
		
	//Write a Java Program to find whether a String is palindrome or not?
	// palindrome is a word that can be read from right to left 
	//and left to right and will be the same 
	// mom --> reversed is still mom
	// dad, madam, race car kayak, bob, radar
		
		/* step1: reverse the string
		 * step2: compare 2 string
		 * 		if strings are equal --> palindrome
		 * 		else--> not palindrome
		 */
		
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

				// instructor way
				
		String original="kayak";
		String reverse="";
		
		for (int i=original.length()-1; i>=0; i--) {
		reverse=reverse+original.charAt(i);	
		}
				
		System.out.println(reverse);
		
		if (original.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Strint is NOT palindrome");
		}
				
	}

}
