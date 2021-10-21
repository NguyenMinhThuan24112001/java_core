import java.util.List;
import java.util.ArrayList;

public class ArrayListExample { 

	public static void main(String[] args) {
//		List<Student> listStudent = new ArrayList<>();
//		listStudent.add(new Student());
//		listStudent.add(null);
		
//		Long startTime = System.currentTimeMillis();
		List<Integer> listName = new ArrayList<>();
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
