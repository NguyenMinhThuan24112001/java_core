
public class Thread1 extends Thread {

	private String name;

	public Thread1(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Đây là luồng " + name + " và giá trị i lúc này: :" + i);
		}
	}
}
