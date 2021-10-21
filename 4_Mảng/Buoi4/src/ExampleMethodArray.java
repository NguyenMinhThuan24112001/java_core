import java.util.Arrays;
import java.util.Scanner;

public class ExampleMethodArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần tìm: ");
		int n = sc.nextInt();
		int[] numbers = new int[4];
		numbers[0] = 3;
		numbers[1] = 8;
		numbers[2] = -2;
		numbers[3] = 2;

		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);
		for (int i = 0; i < 4; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(numbers));

		
		int index = Arrays.binarySearch(numbers, n);
		System.out.println("Số cần tim " + n + " ở vị trí " + index + " trong mảng");


	}
}
