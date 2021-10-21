import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một ký tự: ");
		String kyTu = sc.nextLine();
		checkColor2(kyTu);
	}

	public static void checkColor1(String kyTu) {
		if (kyTu.equals("r") || kyTu.equals("R")) {
			System.out.println("RED");
		} else if (kyTu.equals("g") || kyTu.equals("G")) {
			System.out.println("GREEN");
		} else if (kyTu.equals("b") || kyTu.equals("B")) {
			System.out.println("BLUE");
		} else {
			System.out.println("BLACK");
		}
	}

	public static void checkColor2(String kyTu) {
		String kyTuVietThuong = kyTu.toLowerCase();
		switch (kyTuVietThuong) {
			case "r":
				System.out.println("RED");
				break;
			case "g":
				System.out.println("GREEN");
				break;
			case "b":
				System.out.println("BLUE");
				break;
			default:
				System.out.println("BLACK");
		}
	}

}
