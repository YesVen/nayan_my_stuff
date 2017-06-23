package defaultMtdInterface;

public class TestDefaultMtdInterface {
 public static void main (String a[]) {
	 Test t = new Test();
	 t.method1();
 }
}

interface A {
	default void method1 () {
		System.out.println("Hi");
	}
}

interface B extends A {
	void method1 ();
}

interface C extends A {
	int count = 34;
	default void method1 () {
		System.out.println("Hello" + count);
	}
}

class Test implements B {

	@Override
	public void method1() {
		System.out.println("hii");
	}
	
}