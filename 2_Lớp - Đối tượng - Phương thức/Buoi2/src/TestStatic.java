
public class TestStatic {
	
	public static void main(String[] args) {
		
		int a = ExampleStatic.soNguyenA;
		int tong = ExampleStatic.tingTong(2, 3);
		
		ExampleStatic exampleStatic = new ExampleStatic();
		int b = exampleStatic.soA;
		int tong2 = exampleStatic.tingTong2(5, 7);

	}
}
