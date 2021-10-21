import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập vào hình cần tính diện tích");
			Scanner sc = new Scanner(System.in);
			int nhapSo = sc.nextInt();
			switch (nhapSo) {
			case 1:
				Shape circle = new Circle();
				circle.inputData();
				circle.calArea();
				break;
			case 2:
				Shape rectangle = new Rectangle();
				rectangle.inputData();
				rectangle.calArea();
				break;
			case 3:
				Shape tritangle = new Tritangle();
				tritangle.inputData();
				tritangle.calArea();
				break;
			}
		}

	}

}
