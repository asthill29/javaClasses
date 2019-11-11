package com.class3;

public class IfCondition {

	public static void main(String[] args) {
	
		int a=90;
		int b5=300;
		// if number a is bigger then b
		// I wan to print a is larger than b
		
		if (a>b5){
			
			System.out.println("a is larger than b");		
		}else {
			System.out.println("a is smaller than b");
		}
		
		
		int expectedHours=15;
		int actualHours=20;
		// if expected hours are more than actual --> you will suceed
		//otherwise, please study more 
		
		if(actualHours>expectedHours) {
		System.out.println("you will suceed");
		}else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		// if price is moren than I can afford I will not buy
		//if price is less or matches what I can afford the I will buy tea
		
		if (allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
		}else {
			System.out.println("I cannot afford, I need to study more");
			
				
		}
		
		

	}

}
