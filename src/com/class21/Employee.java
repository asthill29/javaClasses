package com.class21;

public class Employee {
	
	int eID, salary;
	static String CEO;
	
	public void displayEmp() {
System.out.println("The CEO is: "+CEO+" employer ID is #"+eID+" and has a salary of "+salary);
	}	
	
	public static void main(String[] args) {
		
		Employee employer1=new Employee();
		employer1.eID=156;
		employer1.salary=75000;
		employer1.CEO="Sumair";
		employer1.displayEmp();
		
		
		Employee employer2=new Employee();
		employer2.eID=88;
		employer2.salary=90000;
		employer2.CEO="Sumair";
		employer2.displayEmp();

	}

}
