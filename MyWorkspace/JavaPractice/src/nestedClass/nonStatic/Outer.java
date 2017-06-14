package nestedClass.nonStatic;

//TO access non static inner class member outside class: new Outer().new Inner().nonStaticMember
public class Outer {
	//TO access non static inner class member: new Inner().nonStaticMember
	private String text = "test";
	
	private class Inner {
		// TO access non static members: this.nonStaticMembers
		// TO access static members: Outer.staticMember
		private String text = "test2";
		
		private String printText () {
			return Outer.this.text+text;
		}
		
		// this is not allowed
		/*private static String delimeter() {
			return "";
		}*/
		
	}
	
	public static void main (String a[]) {
		Outer.Inner inner = new Outer().new Inner();
		System.out.println(inner.printText());
	}
}
