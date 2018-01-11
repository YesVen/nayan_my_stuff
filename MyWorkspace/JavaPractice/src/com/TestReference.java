package com;

import java.util.ArrayList;
import java.util.List;

public class TestReference {
	
	public void referencetest () {
		
		int a = 2;
		increment(a);
		System.out.println(a);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		addElement(list);
		System.out.println(list);
	}
	
	void increment (int a) {
		a = a + 1;
	}
	
	
	void addElement (List<Integer> list) {
		list.add(3);
	}
	
	
	public static void main (String a[]) {
		new TestReference().referencetest();
	}
}
 