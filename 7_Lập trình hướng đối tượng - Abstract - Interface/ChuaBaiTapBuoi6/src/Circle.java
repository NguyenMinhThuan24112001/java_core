import java.util.Scanner;

public class Circle extends Shape {

	private float banKinh;
	
	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào bán kính hình tròn: ");
		banKinh = sc.nextFloat();
	}

	@Override
	void calArea() {
		System.out.println("Diện tích hình tròn là: " + (banKinh * banKinh * 3.14));
	}
}
