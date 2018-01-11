package com.xyz;

import com.abc.Foo;

public class Boo extends Foo{

	int j = 20;
	
	public void getVariable(){
		//System.out.println(this.i);
	}
	
	public void newMethod () {
		System.out.println(this.i);
		this.method1();
	}
	
	public static void main(String a[]){

	}
}
