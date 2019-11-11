package com.class12;

public class Rcep2D {

	public static void main(String[] args) {
		
		int [][] arr= {
				{1,2,3},  // 1 aaray that store index 0
				{10,20,30},// 2 aaray that store index 1
				{100,200,300}// 3 aaray that store index 2
		};		
			          //how many arrays
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" "); //0 //1 //2
			}
			System.out.println();
		}
		System.out.println("-------- FOR EACH LOOP");
		
		//loop through each element inside 2d Array--> each element=array
		for (int []single:arr) {
			
			//loop through each single array
			for (int numbers:single) {    //{1,2,3}
				
				System.out.print(numbers+" ");
				
			}
			System.out.println();
		}

	}

}
