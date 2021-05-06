package com.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java {
	
	public static void main(String[] args) {
	
		String s="hello world";
		
		String s2="";
		
		String[] split = s.split(" ");
		
		for (String string : split) {
			
			char charAt = string.charAt(0);
			
			char upperCase = Character.toUpperCase(charAt);
			
			String substring = string.substring(1);
			
			s2=s2+upperCase+substring+" ";
			
		}
		System.out.println(s2);
		
	
	}
}