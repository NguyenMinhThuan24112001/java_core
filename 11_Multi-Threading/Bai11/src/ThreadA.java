
public class ThreadA {

	public static void main(String[] args) {

		ThreadB b = new ThreadB();
		b.start();

		ThreadB c = new ThreadB();
		c.start();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + b.total);
		}

		System.out.println(" Chương trình kết thúc");

	}
}
