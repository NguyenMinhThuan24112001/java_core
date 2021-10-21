
public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bắt đầu");
		
		Thread1 thread1 = new Thread1("Thread 1");
		Thread1 thread2 = new Thread1("Thread 2");
		Thread1 thread3 = new Thread1("Thread 3");
		Thread1 thread4 = new Thread1("Thread 4");
		Thread1 thread5 = new Thread1("Thread 5");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
//		thread1.run();
//		thread2.run();
//		thread3.run();
//		thread4.run();
//		thread5.run();
				
		System.out.println("luồng hàm main kết thúc");
		
		
	}

}
