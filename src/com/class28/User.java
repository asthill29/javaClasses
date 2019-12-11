package com.class28;

public class User {
	
	String name, mobile;
	
	User(String name, String mobile){
		this.name=name;
		this.mobile=mobile;
	}

}
class Info extends User{
	
	String address;
	
	Info (String name, String mobile, String address){
	super(name, mobile);
	this.address=address;
	}
	
public void userDetails() {
	System.out.println(name+" "+mobile+" "+address);
}

}