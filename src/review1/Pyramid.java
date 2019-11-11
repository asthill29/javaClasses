package review1;

public class Pyramid {

	public static void main(String[] args) {
		//1
		//12
		//123
		//1234
		//12345
		
		//funny way 
		
	//	System.out.println("1");
	//	System.out.println("12");
	//	System.out.println("123");
	//	System.out.println("1234");
	//	System.out.println("12345");
	//	System.out.println("__________");
		
		//serious way
		
		for (int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("_________");
		//odd number
		for (int a=1; a<=5; a++) {
			for(int colu=1; colu<=a; colu++) {
				System.out.print(2*colu-1);
			}
			System.out.println();
		//raiz cuadrada
			for (int b=1; b<=5; b++) {
				for(int c=1; c<=b; c++) {
					System.out.print(c*c+" ");
				}
				System.out.println();
			}
		
		
		
	}
}
}
