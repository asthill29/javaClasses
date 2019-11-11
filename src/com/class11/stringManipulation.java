package com.class11;

import java.util.Arrays;

public class stringManipulation {

	public static void main(String[] args) {
		
		
		String [] actualName= {"John", "Smith", "Alex", "Tanaz"};
		
		//Array.sort(actualName);
		
		String [] expectedName= {"smith", "John", "Alex", "Tanaz"};
		
		//Array.sort(expectedName);
		
		
		
	// even though the content is the same inside the array, 
	// it wont say they are equals because the order of name are different
		
		
		//System.out.println(Arrays.toString(actualName));
		
		//another way
		
		String actual=Arrays.toString(actualName);
		String expected=Arrays.toString(expectedName);
		
		System.out.println(actual.equals(expected));
		// output is false due to the arrays being different 
		// but when we usea array.sort it will be true
		
	}

}
