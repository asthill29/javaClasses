package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
	
		int [][] array=new int[3][4];
		
		//1st row
		array [0][0]=4;
		array [0][1]=5;
		array [0][2]=6;
		array [0][3]=7;
		
		//2nd row 
		array [1][0]=8;
		array [1][1]=9;
		array [1][2]=10;
		array [1][3]=11;
		
		//3rdrow
		array [2][0]=12;
		array [2][1]=13;
		array [2][2]=14;
		array [2][3]=15;
		
		
		//task1
		// create 2d array of string withh 2 and 3 columns
		
		String [][] animals=new String [2][3];
		
		animals [0][0]="Dog";
		animals [0][1]="Cat";
		animals [0][2]="Cow";
		
		animals [1][0]="Horse";
		animals [1][1]="Birds";
		animals [1][2]="Snake";
		System.out.println(animals[1][0]);

		
		
		//2d array declataion in 1 line
		
		int [][] numbers = {
				{8,7,5,3,1},
				{6,5,7,9,2,0,8},
				{3,4,5,1,9}
				
		};
		
		System.out.println(numbers[1][4]);
		
		//to identify numbers of rows/index
		System.out.println("The number of rows are "+numbers.length);
		
		// to identify numbers of columns/elements
		System.out.println("The numbers of elements are "+numbers[1].length);
	
		
		System.out.println("________________");
		// printing all the values
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
