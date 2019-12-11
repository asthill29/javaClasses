package com.class29;

public abstract class File {
	
	
	public void edit() {
		System.out.println("Edit file");
	}
	
	public void close() {
		System.out.println("Close file");
	}
	
	public abstract void open();
}


class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("Open Java file with sublime text");	
	}
}

class WordFile extends File{

	@Override
	public void open() {
		System.out.println("Open Word file with Microsof");
		
	}
	
	
}