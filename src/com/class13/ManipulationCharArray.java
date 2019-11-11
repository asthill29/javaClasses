package com.class13;

public class ManipulationCharArray {

	public static void main(String[] args) {
		
		
		// toCharArray() this method convert a string into an array
		// it means every character will store as an array

		
		String str="saturday";
		
		char [] array=str.toCharArray();
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		System.out.println("printing in reverse");
		
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		
	
	}

}
