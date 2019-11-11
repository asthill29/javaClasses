package com.class12;

import java.util.Scanner;

public class StringManipulation3 {

	public static void main(String[] args) {
	
		
		// charAt(); returns all the character in the string by index --->
		// staring at 0 

		String str="Students";
		
		char character=str.charAt(7);
		
		for (int i=0; i<str.length(); i++)
		
		System.out.print(str.charAt(i));
		
		
		
		//indexOf()--returns an index of specific character (index 0,1,2)
		System.out.println("____________");
		
		String str1="Sunday";
		int index=str1.indexOf("n");
		System.out.println(index);
		
		
		// looks in what index the words starts and give you the number
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax")); //0
		System.out.println(str2.indexOf("Technologies")); //7
		System.out.println(str2.indexOf(" ")); //6
		System.out.println(str2.indexOf("w")); //-1
		
		System.out.println("____________");
		
		
		//substring() - cut the current string starting at the index 0 until
		// the number you indicate and gives a new string 
		// beginning and ending indicate with " , "
		
		String str3="Today is Sunday Java class";
		
		String newString=str3.substring(9);
		System.out.println(newString); // Sunday java class
		
		System.out.println(str3.substring(0, 5)); //Today
		System.out.println(str3.substring(9, 20)); //Sunday Java
		System.out.println(str3.substring(16, 20)); //Java
		System.out.println(str3.substring(21)); //class
		
	}

}
