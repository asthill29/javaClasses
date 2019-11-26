package com.class05;

public class NestefIfRecap {
public static void main(String[] args) {
	
	
	boolean isDisplay=true;
	String buttonText="Sing in";
	
	
	if(isDisplay) {
		System.out.println("Button is display");
		if (buttonText.equals("Sing in")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Wrong test is displayed");
		}
		
	}else {
		System.out.println("Button is not display");
	}
	

}
}
