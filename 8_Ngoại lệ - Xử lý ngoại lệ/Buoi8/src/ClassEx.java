import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassEx {

	public static void main(String[] args) throws Exception {

		checkedExceptionWithThrows();
		String str = "30/05/1995";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);		
		System.out.println(date1);
		
	}
	
	private static void checkedExceptionWithThrows() throws FileNotFoundException {
		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);
		System.out.println("Chương trình kết thúc");
	}
}
