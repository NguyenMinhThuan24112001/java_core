
public class UncheckEx {

	public static void main(String[] args) {
		unCheckedExceptionWithThrows();
	}

	private static void unCheckedExceptionWithThrows() {
		String str = null;
		
		System.out.println(str.length());

//
//		try {
//			System.out.println(str.length());
//		} catch (NullPointerException ex) {
//			System.out.println("Đã bắt được ngoại lệ");
//		}
	}

}
