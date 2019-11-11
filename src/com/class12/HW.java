package com.class12;

import java.util.Scanner;

public class HW {
	
	public static void main(String[] args) {
	
  
			  

			  Scanner scan=new Scanner (System.in);
			  String name=scan.nextLine();
			 
			  for (int i=0; i<name.length(); i++)	{  
				if (i==0 || i==1 || i==2) {  
						 
	System.out.println("The first 3 letters of "+name+" is "+name.charAt(i));
			  }
			  }
	
}
}

	

