package generics;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		TestClass c = new TestClass();
		c.method();
	}
	
	public void method() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(67);
		
		method2(list);
		System.out.println(list);
		
	}
	
	public void method2(List list) {
		list.add("abc");
	}

}
