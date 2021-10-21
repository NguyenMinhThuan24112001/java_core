import java.util.Scanner;

public class Rectangle extends Shape {
	
	private float chieuDai;
	private float chieuRong;

	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài: ");
		chieuDai = sc.nextFloat();
		System.out.println("Nhập vào chiều rộng: ");
		chieuRong = sc.nextFloat();
	}

	@Override
	void calArea() {
		System.out.println("Diện tích hcn là: " + (chieuDai * chieuRong));
	}

}
