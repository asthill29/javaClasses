package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		//task 1 create and array of cars and store 6 elements and 
		//the use 2 loops and print values 
		
		String [] car= {"Honda", "Jeep", "BMW", "Toyota","Nissan","Lexus"};
		
		for (String allcars:car) {
			 System.out.println(allcars);
		}
		
		
		//task2 the sum of all elements
		
		int []num= {20,4,8,33};
		int sum=0;
		for (int i=0;i<num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		
		
		 System.out.println("*********************");
		 
		 
		 //task3 create array of countries and print capital for each country
		 
		 
		 String [] c= {"Panama", "Colombia", "Argentina"};
		 
		 for (String country:c) {
			
			 if (country.equals("Panama")) {
				 System.out.println("Panama City");
			 }else if (country.equals("Colombia")) {
				 System.out.println("Bogota");
			 }else if (country.equals("Argentina")) {
				 System.out.println("Buenos Aire");
			 }
		 }
		 
	}
	

}
