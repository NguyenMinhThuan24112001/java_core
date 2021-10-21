public class Worker {
	public synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Đây là luồng + " + Thread.currentThread() + n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}