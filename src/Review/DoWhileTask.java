package Review;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
	
		
		//task1 
		
		
		int a=0;
		
		do {
			if (a % 2==1) {
			System.out.println(a);
			}
			a++;	
		}while(a<=15); 
		
		
		
		
		
		//task2
		
int price=0;
        
        do {
            System.out.println("Please pay for candy.");
            Scanner scan=new Scanner(System.in);
            price=scan.nextInt();
            
            
        }while(price!=3);
        System.out.println("Please  enjoy your candy");
	}
}
