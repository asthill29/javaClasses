package com.class35;

import java.util.*;

public class Task2Map {
	
	public static void main(String [] args) {
		
		
		Map<String, String> country=new TreeMap<>();
		
		country.put("Panama", "Panama");
		country.put("Usa", "Washington");
		country.put("Peru", "Lima");
		country.put("Spain", "Madrid");
		
		Set<String> countries=country.keySet();
		
		for(String allCountries:countries) {
			System.out.println(allCountries+":"+country.get(allCountries));
		}
		
		System.out.println("-------");
		Iterator<String> allCountries=countries.iterator();
		while(allCountries.hasNext()) {
			String all=allCountries.next();
			String allCapital=country.get(all);
			System.out.println(all+":"+allCapital);
		}
	}

}
