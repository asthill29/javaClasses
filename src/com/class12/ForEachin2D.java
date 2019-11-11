package com.class12;

public class ForEachin2D {

	public static void main(String[] args) {
		
		
		
		/* create a grocery list: fruits{}
		 *                        veggies{}
		 *                        dairy{}
		 *  retrieved all values using 2 different loops                      
		 */
		
		
		String [][] grocery= {
				{"Apple", "orange", "grapes"},
				{"brocolli", "onion", "carrots"},
				{"cheese", "milk", "ham"},
		
		};
		
		for (String [] list:grocery) {
			
			for (String allGroceries:list) {
				
				System.out.print(allGroceries+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	

}
