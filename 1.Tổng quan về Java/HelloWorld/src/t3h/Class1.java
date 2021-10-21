package t3h;

public class Class1 {

	public static void main(String[] args) {

		int a = 5;
		int b = 8;

		System.out.println("Tổng a + b la: " + (a + b));
		System.out.println("Hiệu a - b la: " + (a - b));
		System.out.println("Tích a * b la: " + (a * b));
		System.out.println("Thương a / b la: " + (a / b));
		System.out.println("Phan Dư a % b la: " + (a % b));

		long c = 10;
		long d = 150000000000000000L;

		c = a;
		a = (int) (c + d);
		System.out.println(a);

		a = (int) d;
		System.out.println(a);
		
		float soThuc = 1.5f;
		int soNguyen = 10;
		
		soNguyen = (int) soThuc;
		soThuc= soNguyen;
		System.out.println("Bien soNguyen la: " + soNguyen);
		System.out.println("Bien soThuc la: " + soThuc);
		
		int bien =  5 + 5 * 6;
		System.out.println(bien);
	}
}
