package threading;

public class ThreadInterrupt {

	public static void main(String a[]) {
		Thread t = new Thread(new ThreadInterrupt().new RunnableTask());
		t.start();
		System.out.println("Done");
		try {
			t.join(5000);
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done done");
	}

	class RunnableTask implements Runnable {

		public void run() {

			for (int i = 0; i < 100000; i++) {
				System.out.println("This is " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("interrupted");
					e.printStackTrace();
					break;
				}
			}

		}
	}
}