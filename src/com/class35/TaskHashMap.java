package com.class35;

import java.util.HashMap;

public class TaskHashMap {
	
	public static void main (String [] args) {
	
	
	HashMap<Integer, String> building = new HashMap<>();
	
	building.put(1, "Google");
	building.put(2, "Syntax");
	building.put(3, "Apple");
	building.put(4, "Samsung");
	building.put(5, "Yahoo");
	building.put(5, "Comcast");
	building.put(7, "Google");
	
	Integer size=building.size();
	System.out.println(size);
	
	String floor=building.replace(4, "Verizon");
	System.out.println(floor);
	
	building.remove(7, "Google");
	System.out.println(building);
	
	}
}
