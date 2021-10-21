import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		double a = 0D;
		boolean checkSoA = true;
		do {
			System.out.println("Nhập vào số a lớn hơn 0: ");
			try {
				Scanner sc = new Scanner(System.in);
				a = sc.nextDouble();	
			} catch (Exception ex) {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
			if (a > 0D) {
				checkSoA = false;
			} else {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
		} while (checkSoA);

		double b = 0D;
		boolean checkSoB = true;
		do {
			System.out.println("Nhập vào số b lớn hơn 0: ");
			try {
				Scanner sc = new Scanner(System.in);
				b = sc.nextDouble();	
			} catch (Exception ex) {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
			if (b > 0D) {
				checkSoB = false;
			} else {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
		} while (checkSoB);

		double c = 0D;
		boolean checkSoC = true;
		do {
			System.out.println("Nhập vào số c lớn hơn 0: ");
			try {
				Scanner sc = new Scanner(System.in);
				c = sc.nextDouble();	
			} catch (Exception ex) {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
			if (c > 0D) {
				checkSoC = false;
			} else {
				System.out.println("Bạn đã nhập sai, vui lòng nhập lại ");
			}	
		} while (checkSoC);

		boolean check = kiemtraTamGiac(a, b, c);
		if (check) {
			System.out.println(" Chu vi tam giác là: " + (a + b + c));

			double p = (a + b + c) / 2;

			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

			System.out.println(" Diện tích tam giác là: " + s);
		}

	}

	public static boolean kiemtraTamGiac(double a, double b, double c) {
		boolean check = false;
		if (a + b <= c || b + c <= a || a + c <= b) {
			System.out.println("Ba số a,b,c không tạo thành một tam giác");
		} else {
			System.out.println("Ba số a,b,c có tạo thành một tam giác");
			check = true;
		}
		return check;
	}

}
