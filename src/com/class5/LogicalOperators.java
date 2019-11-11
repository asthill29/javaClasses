package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num=200;
			// true and false --- false	
		if (num>1 && num <10) {
			System.out.println("this number is small");
			    //true and false ----> false
		}else if (num>=10 && num<100) {
			System.out.println("ths number is medium");
			
			      // true and true --->true
		}else if (num>=100 && num<1000) {
			System.out.println("this number is large");
		}else {
			System.out.println("number is out of our range");
		}
		
		
		
		
		
	}

}
