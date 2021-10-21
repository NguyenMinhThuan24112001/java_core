import java.util.List;

public class Array {
	
	public static void main(String[] args) {
		
		
//		System.out.println(" Đây là một mảng ");
//		
//		int[] numbers = new int[4];
//		numbers[0] = -2;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 8;
//		
//		for (int number: numbers) {
//			System.out.println(number);
//		}
//		
//		
//		numbers[0] = 7;
//		numbers[2] = 5;
//		
//		System.out.println("Mảng mới sau khi sửa đổi");
//		
//		for (int i = 0; i < numbers.length; i++) {
//			
//			System.out.println("Phần tử thứ " + i + " là: ");
//			System.out.println(numbers[i]);
//		}
//		
//		int[] numbers1 = {-2, 2, 3, 8 };
//		
//		String[] strs = new String[4];
//		
//		String[] strs1 = {"A", "B", "C", "D"};
//		for (int i = 0; i < strs1.length; i++) {
//			
//			System.out.println("Phần tử thứ " + i + " là: ");
//			System.out.println(strs1[i]);
//		}
//		
		
//		char[] chars = new char[5];
		
		Student[] students = new Student[3];
		students[0] = new Student("Vinh", 15);
		students[1] = new Student("Cuong", 16);
		students[2] = new Student("Manh", 14);

		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Phần tử thứ " + i + " là: ");
			Student s = students[i];
			System.out.println(s.toString());
		}
	}
}
