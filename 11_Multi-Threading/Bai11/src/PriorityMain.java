
public class PriorityMain {

	
	public static void main(String[] args) {
		
		RunnableExample runnableExample1 = new RunnableExample("Thread 1");

		Thread t1 = new Thread(runnableExample1, "Luồng 1");
		Thread t2 = new Thread(runnableExample1, "Luồng 2");
		Thread t3 = new Thread(runnableExample1, "Luồng 3");

//		t1.setPriority(4);
//		t3.setPriority(8);
//		t2.setPriority(2);
		
		System.out.println("Thứ tự ưu tiên của luồng 1 là: " + t1.getPriority());;
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
