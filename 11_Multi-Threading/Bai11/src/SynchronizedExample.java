public class SynchronizedExample {
	
	public static void main(String args[]) {
		final Worker worker = new Worker();
		Thread t1 = new Thread() {
			public void run() {
				worker.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				worker.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}
}