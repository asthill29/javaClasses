package com.class10;

public class Countries {

	public static void main(String[] args) {
		
		
		String [] country = {"Usa", "Panama", "Argentina"};
		
		
		for (int i=0; i<country.length; i++) {
			
			switch (country[i]) {
			
			case "Usa":
				System.out.println("Washington DC");
				break;
			case "Panama":
				System.out.println("Panama");
				break;
			case "Argentina":
				System.out.println("Buenos Aire");
				break;
			}
		}
	}

}
