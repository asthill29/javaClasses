package com.class09;

public class Pattern {

	public static void main(String[] args) {
		
	for (int k=1; k<=5; k++) {
		
		for (int j=1; j<7; j++) {
			System.out.print("*");
		}
		System.out.println();
	}	
		
	System.out.println("^^^^^^^^^^^");
	
	
	for (int a=1; a<6; a++) {
		
		for (int b=1; b<11; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("#########");	
	
	
	for (int c=1; c<11; c++) {// number of rows
		
		for (int d=1; d<16; d++) {// number of columns
			System.out.print("*");
		}
		System.out.println();
	}	
		
		
		
	}

}
