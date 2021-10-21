
public class GenericExample {

	public static <M> void hienThiDuLieu(M[] tenbienM) {
		for (M element : tenbienM) {
			System.out.println(element);
		}
		
		M m1;
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {2,3,2,5,6};
		Double[] doubleArray = {1.5, 2.0, 3.4};
		Character[] charArray = {'x', 'y', 'h', 'a', '1'};
		String[] strArray = {"Dương", "Huy", "Hiệp", "Phụng"};
		
		hienThiDuLieu(intArray);
		hienThiDuLieu(doubleArray);
		hienThiDuLieu(charArray);
		hienThiDuLieu(strArray);
		
	}
	
	public void methodA() {
		
	}

}
