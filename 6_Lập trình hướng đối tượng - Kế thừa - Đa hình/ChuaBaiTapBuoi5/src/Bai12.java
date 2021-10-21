import java.util.Scanner;

public class Bai12 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số điện thoại");
		String str = sc.nextLine();
		
		// check tất cả ký tự phải là số nguyên
		
		
		
		// check không có khoảng trắng trong chuỗi
		if(str.indexOf(" ") > 0) {
			System.out.println("Đây không phải số điện thoại");
			return;
		}
		
		if(!str.startsWith("0") && !str.startsWith("+84")) {
			System.out.println("Đây không phải số điện thoại");
			return;
		}
		
		if(str.startsWith("0") && str.length() != 10) {
			System.out.println("Đây không phải số điện thoại");
			return;
		}
		
		if(str.startsWith("+84") && str.length() != 12) {
			System.out.println("Đây không phải số điện thoại");
			return;
		}
		
		System.out.println("đây là số điện thoại");
		
	}
}
