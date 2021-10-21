import java.util.Scanner;

public class InfoPerson {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên ");
		String name = sc.nextLine();
		System.out.println("Nhập tuổi ");
		int age = sc.nextInt();
		System.out.println("Nhập gioi tinh ");
		String gender = sc.nextLine();
		
		if(name.equals("Trang") && age == 16 && gender.equals("Nu")) {
			System.out.println(" Đây là người tôi đang tìm kiếm ");
		} else {
			System.out.println(" Đây không phải người tôi cần tìm");
		}
	}
}
