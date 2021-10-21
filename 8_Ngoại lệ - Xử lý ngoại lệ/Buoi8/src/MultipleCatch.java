public class MultipleCatch {

	public static void main(String[] args) throws Throwable {
		try {
			int a[] = new int[5];
//			a[5] = 30 / 0;
			throw new Throwable();
//			throw new Error();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} finally {
			System.out.println("Khối finally vẫn được chạy");
		}
		System.out.println("Complete task");
	}

}
