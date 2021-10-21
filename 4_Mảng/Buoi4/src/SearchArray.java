import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần tìm: ");
		int n = sc.nextInt();
		int[] numbers = new int[4];
		numbers[0] = -2;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 8;

		for (int i = 0; i < 4; i++) {
			if (i == (numbers.length - 1)) {
				if (numbers[i - 1] != n) {
					System.out.println(" Số cần tìm không có ở trong mảng");
					break;
				}
			}
			if (numbers[i] == n) {
				System.out.println("Số cần tim " + n + " ở vị trí " + i + " trong mảng");
				break;
			}

		}

	}
}
