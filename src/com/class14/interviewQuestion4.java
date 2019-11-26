package com.class14;

public class interviewQuestion4 {

	public static void main(String[] args) {
	
//How to find out the part of the string from a string? 
//What is substring? 
		
		
	String a="How to find out the part of the string from a string? "
			+ "What is substring?";			
		System.out.println(a.substring(0,15));
		
				
//Find number of words in string?
			String b="Find number of words in string?";
			String[] bNew=b.split(" ");
			System.out.println(bNew.length);
		
		
	}

}
