package com.class36;
import java.util.*;
import java.util.Map.Entry;


public class HW {
	
	public static void main (String [] args) {
		Map<Integer, String> map=new TreeMap<>();
		
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP printer");
		map.put(3455, "Dell Screen");
		map.put(8753, "Samsung TV");
		map.put(1765, "Sony Camera");
		
		
		System.out.println(map);
		
		
		//to retrieve key-value using Entry Set
		Set<Entry<Integer, String>> set=map.entrySet();
		for (Entry<Integer, String> entry:set) {
			String element=entry.getKey()+"=="+entry.getValue();
			System.out.println(element);
		}
		
System.out.println("--- retrieving key and value using iterator--");

Iterator<Entry<Integer,String>> entryIterator=map.entrySet().iterator();
while (entryIterator.hasNext()) {
	Entry<Integer, String> single=entryIterator.next();
	System.out.println(single.getKey()+"--"+single.getValue());
}



		
		
	}

}
