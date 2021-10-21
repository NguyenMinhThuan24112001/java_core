package t3h;

public class Student {

	public static String name = "John";

	static int age = 18;

	protected static String bith = "05/06/1991";

	private static String address = "8 Wall Street";

	public static String getName() {
		return name;
	}

	public static String getName2() {
		return "Chuỗi ký tự";
	}
	
	public static int countMethod = 0;

	public static int dem = 0;

	public static void getName3() {
		dem++;
		countMethod++;
		System.out.println("Hàm này đã được gọi lần thứ: " + countMethod);
		if (dem <= 5) {
			getName3();
		}
	}

	static void getAge() {
	}

	private static String getAddress() {

		return address;
	}

	public static void layThongTinSinhVien(String firstName, String lastName) {
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Full Name: " + firstName + " " + lastName);

	}

	public static void layThongTinNgaySinh(String ngaySinh) {
		System.out.println("Ngày sinh: " + ngaySinh);
	}

	public static void main(String[] args) {

//		String getName = "abc";
//		
//		System.out.println(name);
//		
//		System.out.println(address);
//		getAddress();
//		
//		System.out.println(age);
//		age = 19;
//		getAge();

//		
//		String ngaySinh = "01/02/1993";
//		layThongTinSinhVien("Lê Mạnh", "Hiệp");
//		layThongTinNgaySinh(ngaySinh);

		System.out.println("Chương trình bắt đầu chạy từ đây");

		getName3();

		System.out.println("Chương trình kết thúc");

	}
}
