package com.class14;

public class StringMethodRecap {

	public static void main(String[] args) {
	
		
		// .replaceAll
		
		String str="Syntax Technologies students way hello bye world video radio ";
		System.out.println(str.replaceAll("way(.*)", "")); 
		//removed everything after way
		
		
		//replace with words case sensitive
		// video in String first time has V in caps and 2time has v in small cap
		// we use .toLowerCase() to replace both "video" words 
		
		String str1="Syntax Technologies Video students way hello bye world video radio ";
		System.out.println(str1.toLowerCase().replaceAll("video", "Audio")); 
		

	}

}
