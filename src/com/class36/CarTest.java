package com.class36;
import java.util.*;
import java.util.Map.Entry;

//create a car class that will have variables, methods and constructor 

//create a map that will hold car numbers  and car objects store in it  
class Car{
	String make, model;
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	
	public void display() {
		System.out.println(make+" "+model);  
	}
	
}

public class CarTest {
	
	public static void main(String[] args) {
	
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "Mkc"));
		System.out.println(mapCar.size());
		
		//display only value objects
		Collection<Car> coll=mapCar.values();
		for (Car c:coll){
			System.out.println(c.make+"--"+c.model);
			c.display();//calling thr method in car class
		}		
		
		//map key to its corresponding values
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		for(Entry<Integer,Car> ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i+" is associated with value of "+c.make);	
		}
		
	System.out.println("-----using keySet");
	// using keySet to map keys to values
	Set<Integer> keySet=mapCar.keySet();
	for (Integer key:keySet) {
 //System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
		Car car=mapCar.get(key);
		String carDetails=car.make+"-"+car.model;
		System.out.println(key+"="+carDetails);				
	}
	System.out.println("USING ITERATOR");
	//use Iterator to iterate through values, keySet, entrySet
	
	Iterator<Entry<Integer, Car>> it=mapCar.entrySet().iterator();
	while(it.hasNext()) {
		Entry<Integer,Car> ele=it.next();
		System.out.println(ele.getKey()+"="+ele.getValue().make+ele.getValue().model);
	}
		
		
		
		
		
		
		
	}

}
