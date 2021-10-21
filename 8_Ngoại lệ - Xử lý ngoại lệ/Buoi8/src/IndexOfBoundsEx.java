
public class IndexOfBoundsEx {

	public static void main(String[] args) {

		int[] mangA = new int[4];

		mangA[4] = 10;
		
//		try {
//			int[] mangA = new int[4];
//
//			mangA[7] = 10;
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println(" Đã bắt được kiểu ngoại lệ ");
//		}
		
		String str = "abc";
		
		str.charAt(6);
		
		System.out.println(" Chương trình tiếp tục");
	}
}
