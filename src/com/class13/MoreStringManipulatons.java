package com.class13;

public class MoreStringManipulatons {

	public static void main(String[] args) {
		
		
		// replaceAll
		//regular expression search pattern in a String 
		// [A-Z]
		//[a-z]
		//[0-9]
		//[^a-z]
		
		String str="12 Hello 3234 World 465%";
		
		
		System.out.println(str.replaceAll("[0-9]", ""));// no numbers
		
		System.out.println(str.replaceAll("[^A-Za-z]", "" ));

		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
	}

}
