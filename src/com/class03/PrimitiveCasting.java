package com.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//widening or automatic or implicit casting
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		//here the system run it since its a small box into a larger box.
		// from int to double notice it run it as a double number.4
		
		
		
		
		
		
		//narrowing or explicit or manual casting
		// the system will let you do it but at your risk since you will lost info
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		
	}
}
