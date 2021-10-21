import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("not_existing_file.txt");
		try {
			System.out.println("Bắt đầu khối lệnh try ");
			FileInputStream stream = new FileInputStream(file);
			System.out.println(" Kết thúc khối lệnh try ");
		} catch (FileNotFoundException e) {
			System.out.println("Xử lý ngoại lệ");
			e.printStackTrace();

			System.out.println(" Kết thúc khối lệnh catch");
		} finally {
			System.out.println("Chương trình kết thúc");
		}

		main2();
		System.out.println("Chương trình đã chết hay chưa");
	}

	public static void main2() throws FileNotFoundException {
		File file = new File("not_existing_file.txt");
		try {
			System.out.println("Bắt đầu khối lệnh try ");
			FileInputStream stream = new FileInputStream(file);
			System.out.println(" Kết thúc khối lệnh try ");
			return;
		} finally {
			System.out.println("Chương trình kết thúc");
		}
	}

	public static void main3() {
		File file = new File("not_existing_file.txt");

		try {
			System.out.println("Bắt đầu khối lệnh try ");
			FileInputStream stream = new FileInputStream(file);
			System.out.println(" Kết thúc khối lệnh try ");
		} catch (FileNotFoundException e) {
			System.out.println("Xử lý ngoại lệ");
			e.printStackTrace();
			System.out.println(" Kết thúc khối lệnh catch");
			return;
		}
	}
}
