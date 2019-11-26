package com.class07;

public class taskWhileLoop {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		
		while (workDay) {
			
			if (day==6) {
			System.out.println("I do not need a day off");
			workDay=false;
		}else {
			System.out.println("I need a day off anymore");
		}
		day++;
		
		
		}
	/*ANOTHER WAY 
	 *
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
		System.out.println("I need a day off");
			if (day==6) {
			System.out.println("I do not need a day off anymore");
		}
		day++;
		
		}
	 *	
	 */
	
	}
}
