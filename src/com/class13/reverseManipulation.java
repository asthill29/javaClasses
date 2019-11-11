package com.class13;

public class reverseManipulation {

	public static void main(String[] args) {


		// popular question in a interview 
				// Reverse a String without using a reverse function
				
				// 1 way using toCharArray();
				
				String original="Today is Java Class";
				String reverse="";
				char [] array=original.toCharArray();
				
				for (int i=array.length-1; i>=0; i--) {
					reverse=reverse+array[i];
				}
				System.out.println("Reverse String is: " +reverse);
				
				//2 way using charAt();

				String reverse2="";
				
				for (int i=original.length()-1; i>=0; i--) {
					reverse2=reverse2+original.charAt(i);
				}
				System.out.println("Reverse String is: "+reverse2);
				
			
				// 3 way using substring();		
				
				String reverse3="";
				
				for (int i=original.length(); i>0; i--) {
					reverse3=reverse3+original.substring(i-1, i);
				}
				System.out.println("Reverse String is: "+reverse3);
			
	}

}
