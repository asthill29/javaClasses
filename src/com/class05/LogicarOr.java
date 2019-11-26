package com.class05;

public class LogicarOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7 days a week
		// if day is 2 or 4 ---> SDLC class
		// if day is 6 or 7 ---> Java class
		// if day is 1 or 5 ---> no class
		// if day =3 ---> review class

		
		int day=8;
		    // false or false
		if (day==2 || day==4) {
		System.out.println("SDLC class");
		       // true or false
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
			    // false or false 
		}else if (day==1 || day==5) {
			      // false
		}else if (day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("**************");
			
		}
		
		// 7 days a week
				// if day is Tuesday or Thursday ---> SDLC class
				// if day is Saturday or Sunday ---> Java class
				// if day is Monday or Friday ---> no class
				// if day Wednesday ---> review class
		
		String weekDay="Tuesday";
		
		if (weekDay.contentEquals("Tuesday") || weekDay.contentEquals("Thursday")) {
		System.out.println("SDLC class");
		} else if (weekDay.contentEquals("Saturday") || weekDay.contentEquals("Sunday")) {
			System.out.println("Java class");
		}else if (weekDay.contentEquals("Monday") || weekDay.contentEquals("Friday")) {
			System.out.println("No class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		
	}

}
