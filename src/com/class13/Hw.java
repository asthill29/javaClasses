package com.class13;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		
		
		String fatherName, motherName, gender, babyName;
		
		
		System.out.println("Please enter father name");
		fatherName=scan.nextLine();		
		
		System.out.println("Please enter mother name");
		motherName=scan.nextLine();		
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();		
		
		if (gender.equalsIgnoreCase("boy")){ //also u can use .contains():
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if (gender.equalsIgnoreCase("girl")){
			babyName=motherName.substring(0, motherName.length()/2)+
					fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
		}
		System.out.println();
	}

}
