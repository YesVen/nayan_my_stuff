package immutability;

public class ThreadSafeImmutableString {
	
	public static void main (String aa[]) {
		
		String a = new String("myString");
		Thread t1 = new Thread(new Task2(a)); t1.start();
		Thread t2 = new Thread(new Task2(a)); t2.start();
		Thread t3 = new Thread(new Task2(a)); t3.start();
		Thread t4 = new Thread(new Task2(a)); t4.start();
		Thread t5 = new Thread(new Task2(a)); t5.start();
		
		Thread t61 = new Thread(new Task3(a)); t61.start();
		Thread t71 = new Thread(new Task3(a)); t71.start();
		Thread t81 = new Thread(new Task3(a)); t81.start();
		Thread t91 = new Thread(new Task3(a)); t91.start();
		
		Thread t6 = new Thread(new Task2(a)); t6.start();
		Thread t7 = new Thread(new Task2(a)); t7.start();
		Thread t8 = new Thread(new Task2(a)); t8.start();
		Thread t9 = new Thread(new Task2(a)); t9.start();
		Thread t10 = new Thread(new Task2(a)); t10.start();
		Thread t11 = new Thread(new Task2(a)); t11.start();
		Thread t12 = new Thread(new Task2(a)); t12.start();
	}
	
	
}

 class Task2 implements Runnable {
	 String a;
	 public Task2(String a) {
		 this.a = a;
	 }
	 public void run () {
		 System.out.println("String value is " + a);
	 }
	 
 }
 
 class Task3 implements Runnable {
	 String a;
	 public Task3(String a) {
		 this.a = a;
	 }
	 public void run () {
		 a = a + "newStr";
		 System.out.println("String value is " + a);
	 }
	 
 }



