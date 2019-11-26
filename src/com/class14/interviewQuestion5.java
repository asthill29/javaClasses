package com.class14;

public class interviewQuestion5 {

	public static void main(String[] args) {
		
	 //Write a java program to reverse String? Reverse a string word by word?
		
				String a="Java is the best!";
				char[] aNew=a.toCharArray();
				for (int i = aNew.length-1; i >= 0; i--) {
					System.out.print(aNew[i]);
				}
				
				
	}

}
