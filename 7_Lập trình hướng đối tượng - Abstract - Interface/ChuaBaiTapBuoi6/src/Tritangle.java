import java.util.Scanner;

public class Tritangle extends Shape {

	private float canhA;
	private float canhB;
	private float canhC;

	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào cạnh A: ");
		canhA = sc.nextFloat();
		System.out.println("Nhập vào cạnh B: ");
		canhB = sc.nextFloat();
		System.out.println("Nhập vào cạnh C: ");
		canhC = sc.nextFloat();
	}

	@Override
	void calArea() {
		float p = (canhA + canhB + canhC) / 2;
		System.out.println("Diện tích hcn là: " + Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC)));
	}

}
