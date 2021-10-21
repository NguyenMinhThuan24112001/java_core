import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

//		Long startTime = System.currentTimeMillis();
		List<Integer> listName = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			listName.add(getRandomNumber(0, 20000));
		}
//		System.out.println("Tổng thời gian chương trình chạy là: " + (System.currentTimeMillis() - startTime));

		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < listName.size(); i++) {
			System.out.println(listName.get(i));
		}

		System.out.println("Tổng thời gian chương trình chạy là: " + (System.currentTimeMillis() - startTime));
	}

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
