package com.class29;

public class FileTest {

	public static void main(String[] args) {
		
		
		File obj=new JavaFile();
		obj.edit();
		obj.close();
		obj.open();
		
		File obj1=new WordFile();
		obj1.edit();
		obj1.close();
		obj1.open();
	}

}
