package com.xyz;

import com.abc.Foo;

public class Boo extends Foo{

	int j = 20;
	
	public void getVariable(){
		System.out.println(this.i);
	}
	
	/*public void newMethod () {
		Foo f = new Foo();
		f.i;
		f.method1();
			
	}	*/
	
	
	
	public static void main(String a[]){
		
		/*Foo f = new Foo();
		f.i;
		f.method1();
		*/
		Boo b = new Boo();
		//System.out.println(b.i);
	}
}
