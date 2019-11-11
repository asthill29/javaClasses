package com.class14;

public class Splitmethod2 {

	public static void main(String[] args) {
		
		// more split examples 
		
		
		String str="wwelcome to syntax techonologies";
		String [] array=str.split(" ", 3); // we limited to 2 
		System.out.println(array.length);

		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
