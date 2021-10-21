import java.io.FileNotFoundException;

public class Example2Throw {

	public void amountCheck(int amount) throws ArithmeticException, FileNotFoundException {
		if (amount < 100) {
			throw new ArithmeticException("Amount Invalid");
		}
	}

	public static void main(String args[]) {
		try {
			main2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Chương trình kết thúc");
	}

	public static void main2() throws FileNotFoundException {
		Example2Throw obj = new Example2Throw();
		try {
			obj.amountCheck(60);
		} catch (ArithmeticException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}
