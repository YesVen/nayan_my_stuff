package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		
		List<?> list = new ArrayList<Integer>();
	}
	
	public static void someMethod (String prefix , String word) {
	
		if (word.isEmpty()) {
			System.out.println(prefix + word);
		}
		
		for (int i = 0; i < word.length(); i++ ) {
			someMethod(prefix + word.charAt(i) , word.substring(0, i) + word.substring(i + 1, word.length()) );
		}
	}	 
}
