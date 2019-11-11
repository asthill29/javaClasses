package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean b1=!true;
	boolean b2=!false;
	
	System.out.println(b1);
	System.out.println(b2);
	
	boolean traffic=true;
	
	if (!traffic) { //by using ! we are reversing the condition
		System.out.println("On time");
	}else {
		System.out.println("Late");
	}
		
	boolean isRain=false;
	
	if(!isRain) {
		System.out.println("Take an umbrella");
	}else {
		System.out.println("Don't take an umbrella");
	}
	// let's compare 2 numbers using NOT operators
	
	
	int num1=10;
	int num2=11;
	
	if (num1==num2) {
		System.out.println("numbers are equal");
	}else {}
	System.out.println("numbers are not equal");
	
	if (!(num1==num2)) {
		System.out.println("Numbers are NOT equal");
	}else {
		System.out.println("number are equal");
	}
	
	//if name is not Mary or Anna then you are not my sister
	String name="Marry";
	String name2="Anna";
	
	if (!(name.equals("Marry") || name2.equals("Ana"))) {
		System.out.println("You are not my sister");
	}else {
		System.out.println("You are my sister");
	}
	
	
	
	}

}
