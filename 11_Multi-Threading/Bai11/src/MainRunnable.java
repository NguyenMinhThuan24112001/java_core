
public class MainRunnable {

	public static void main(String[] args) throws InterruptedException {

		RunnableExample runnableExample1 = new RunnableExample("Thread 1");
		RunnableExample runnableExample2 = new RunnableExample("Thread 2");
		RunnableExample runnableExample3 = new RunnableExample("Thread 3");


		Thread t1 = new Thread(runnableExample1, "First Thread");
		Thread t2 = new Thread(runnableExample2, "Second Thread");
		Thread t3 = new Thread(runnableExample3, "Third Thread");

		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();

		// khi nào t1 kết thúc thì mới chạy tiêp
//		t1.join();

		t2.start();
		t3.start();

//		System.out.println("Luồng 1 đã dead: " + !t1.isAlive());

	}
}
