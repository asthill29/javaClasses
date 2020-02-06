package com.class35;

import java.util.*;

public class RetrieveAllKeys {
	
	public static void main(String[] args) {
		//Create a map of a person(name,lastName, address, city, state)

		Map<String, String> personMap=new HashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and all values?
		System.out.println("-----Printing all keys-------------");
		Set<String> keys=personMap.keySet();
		
		for(String key: keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
			
		}

		
		System.out.println("-----Printing all keys using iterator-------------");
		//how can I retrieve and print values key:value using iterator
		Iterator<String> keysIterator1=keys.iterator();
		while(keysIterator1.hasNext()) {
			//System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next()));
			String mapKey=keysIterator1.next();
			String mapValue=personMap.get(mapKey);
			
			System.out.println(mapKey+"_"+mapValue);
		}
	}
		
		
	

}
