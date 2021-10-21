
public class RunnableExample implements Runnable {

	private String name;

	public RunnableExample(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Đây là luồng " + Thread.currentThread() + " và giá trị i lúc này: :" + i);
		}
		
		System.out.println("Thread: " + Thread.currentThread() + " đã kết thúc");
	}
}
