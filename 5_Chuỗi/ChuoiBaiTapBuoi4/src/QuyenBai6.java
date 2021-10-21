import java.util.Scanner;

public class QuyenBai6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng A: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập A[" + i + "]: ");
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];

		boolean check = false;
		arr2[0] = arr[0];
		int e = 1;
		for (int i = 1; i < arr.length; i++) {
			check = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					check = true;
					break;
				}
			}
//			System.out.println(check);
			if (check == false) {
				arr2[e] = arr[i];
				e++;
			}

		}

		System.out.println("arr2 = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 0; i < e; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr2[i]) {
					count++;
				}
			}
			System.out.println(arr2[i] + " xuất hiện " + count + " lần");
		}
	}
}
