import java.util.Scanner;

public class Huy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		boolean check = false;
		while (check == false) {
			System.out.println("Nhập vào số A: ");
			a = sc.nextDouble();
			System.out.println("Nhập vào số B: ");
			b = sc.nextDouble();
			System.out.println("Nhập vào số C: ");
			c = sc.nextDouble();
			if (a < 0) {
				System.out.println("Vui lòng nhập lai A>0");
			}
			if (b < 0) {
				System.out.println("Vui lòng nhập lại B>0");
			}
			if (c < 0) {
				System.out.println("Vui lòng nhập lại C>0");
			} else {
				check = true;
			}
		}
	}
}
