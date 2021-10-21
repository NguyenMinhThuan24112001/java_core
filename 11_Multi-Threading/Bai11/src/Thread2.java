
public class Thread2 extends Thread {

	private String name;

	public Thread2(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Luồng " + name + " bắt đầu nghỉ 4 giây và giá trị i lúc này:" + i);
				Thread.sleep(10);
				System.out.println("Luồng " + name + " đã nghỉ xong và giá trị i lúc này:" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		System.out.println("Luồng: " + name + " đã kết thúc (ở trạng thái Dead)");
	}
}
