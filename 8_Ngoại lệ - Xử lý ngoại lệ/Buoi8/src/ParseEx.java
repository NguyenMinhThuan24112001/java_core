import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseEx {

	public static void main(String[] args) throws ParseException {
		String str = "30/05/1995";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);		
		System.out.println(date1);
	}

}
