
public class ExampleThrowTryCatch {

	public static void testThrow(String str) {
		try {
			if (str == null)
				throw new ValidateException("Null invalid");
			else
				System.out.println("correct");
		} catch (ValidateException ex) {
			System.out.println("Xử lý ngoại lệ");
			
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String args[]) {
		testThrow(null);
		System.out.println("Chương trình kết thúc");
	}
}
