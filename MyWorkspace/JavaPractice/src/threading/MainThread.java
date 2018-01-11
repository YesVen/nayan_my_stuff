package threading;

public class MainThread {
	
	public static void main(String a[]) {
		
		Task t = new Task();
		t.start();
		//t.run();
		
		for (int i = 101; i <= 200; i++) {
			System.out.println(i);
		}
	}
}
	
	class Task extends Thread {
		
		public void run () {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(i);
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					System.out.println("interruped");
				}
			}
		}
	}
