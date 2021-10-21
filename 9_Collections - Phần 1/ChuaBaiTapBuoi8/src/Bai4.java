import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập vào một chuỗi ");
		String str = sc.nextLine();

		if (str.isEmpty()) {
			str = null;
		}
		Float bienFloat = null;
		try {
			bienFloat = Float.valueOf(str);
		} catch (NullPointerException | NumberFormatException ex) {
			System.err.println(ex);
		}

		try {
			System.out.println("Kết quả 10 chia số đó là: " + 10 / bienFloat);
		} catch (Exception ex) {
			System.out.println("Không thể thực hiện thao tác, vui lòng báo quản trị viên.");
			System.err.println(ex);
		} finally {
			System.out.println("Chương trình kết thúc.");
		}

	}
}
