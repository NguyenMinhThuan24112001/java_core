import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng A: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập A[" + i + "]: ");
			arr[i] = sc.nextInt();
		}
				
		Arrays.sort(arr);
		
	
		System.out.println(Arrays.toString(arr));
		int dem = 1;
		
		int elementArray = 0;
		int[] arrDuplicate = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			if(i == n - 1) {
				break;
			}
			if(arr[i] != arr[i + 1]) {
				arrDuplicate[elementArray] = dem;
				elementArray += 1;
				dem = 0;
			} else {
				dem++;
			}
		}
		
		System.out.println(Arrays.toString(arrDuplicate));


	}
}
