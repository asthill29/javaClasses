package com.class14;

import java.util.Arrays;

public class interviewQuestion2 {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 */
		// Second largest number
		int [] array= {23,45,67,2,34,89,76,95};
		Arrays.sort(array); //will sort from the smalles to the largest
		System.out.println(array[array.length-2]);
		//Maximum number
		System.out.println(array[array.length-1]);
		//Minimum number
		System.out.println(array[0]);
//Asel instructor way
// easiest way is to use arrays.sort();
		
		
		int [] array1= {23,45,67,2,34,89,76,95};
		int large=array1[0];
		int secondLarge=array1[0];
		
		for (int i=0; i<array1.length; i++) {
			
			if (array1[i]>large) {
				large=array[i];
			}
			
		}
		
		
		
		// 
		
		
	}

}
