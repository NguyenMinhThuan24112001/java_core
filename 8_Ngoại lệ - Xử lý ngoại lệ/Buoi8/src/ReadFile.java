import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {

	
	public static void main(String[] args) throws FileNotFoundException {
		checkedExceptionWithThrows();
	}
	
	private static void checkedExceptionWithThrows() throws FileNotFoundException, RuntimeException {
		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);
		System.out.println("Chương trình kết thúc");
	}
}
