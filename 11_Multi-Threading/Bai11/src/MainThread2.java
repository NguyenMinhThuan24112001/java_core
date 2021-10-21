
public class MainThread2 {

	public static void main(String[] args) {

		System.out.println("Bắt đầu");

		Thread2 thread1 = new Thread2("Thread 1");
		Thread2 thread2 = new Thread2("Thread 2");
		Thread2 thread3 = new Thread2("Thread 3");
		Thread2 thread4 = new Thread2("Thread 4");
		Thread2 thread5 = new Thread2("Thread 5");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("luồng hàm main kết thúc");

	}
}
