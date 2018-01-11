package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReantrantLockTest {
	public static void main (String a[]) {
		
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		
		Thread t1 = new Thread(new writeThread(lock));
		Thread t2 = new Thread(new readThread(lock));
		Thread t3 = new Thread(new readThread(lock));
		Thread t4 = new Thread(new readThread(lock));
		Thread t5 = new Thread(new readThread(lock));
		Thread t6 = new Thread(new readThread(lock));
		Thread t7 = new Thread(new readThread(lock));
		Thread t8 = new Thread(new readThread(lock));
		Thread t9 = new Thread(new readThread(lock));
		Thread t10 = new Thread(new readThread(lock));
		
		t2.start();t3.start();t4.start();
		t1.start();
		t5.start();t6.start();t7.start();t8.start();
		t9.start();t10.start();
	}
	
}

class writeThread implements Runnable {
	ReentrantReadWriteLock lock;
	writeThread (ReentrantReadWriteLock lock) {
		this.lock = lock;
	}
	public void run () {
	lock.writeLock().lock();
	System.out.println("About to writing ...");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Done writing");
	lock.writeLock().unlock();
	}
}

class readThread implements Runnable {
	ReentrantReadWriteLock lock;
	readThread (ReentrantReadWriteLock lock) {
		this.lock = lock;
	}
	public void run () {
		lock.readLock().lock();
		System.out.println("reading...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done reading");
		lock.readLock().unlock();
	}
}