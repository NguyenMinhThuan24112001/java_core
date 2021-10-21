import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập vào số a: ");
		int a = sc.nextInt();
		if (a > 0 &&  b > 3) {
			System.out.println("Số a lớn hơn 0");
		} else if (a < -6) {
			System.out.println("Số a nhỏ hơn -6");
		} else if (a <= 4 && a >= 2) {
			System.out.println("Số a lớn hơn bằng 2 và nhỏ hơn bằng 4");
		} else if (a >= 99) {
			System.out.println("Số a nhỏ hoặc bằng 99");
		} else {
			System.out.println(" Các trường hợp còn lại");
		}

		System.out.println("Chương trình kết thúc");
	}
}
