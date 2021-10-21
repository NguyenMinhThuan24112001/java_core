import java.util.ArrayList;
import java.util.List;

public class ArrayString {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Nguyễn Văn A-30-Nam-Hai Bà Trưng, Hà Nội-12/03/1992");
		list.add("Nguyễn Văn B-31-Nữ-Hoàng Mai, Hà Nội-20/06/1995");
		list.add("Nguyễn Văn C-32-Nam-Cầu Giấy, Hà Nội-18/11/1991");
		
		
		for (String element: list) {
			
			String[] strs = element.split("-");
			
			String name = strs[0];
			String bith = strs[4];
			System.out.println("Ngày sinh của bạn "+ strs[0]);
			System.out.println(strs[4]);
			
		}
		
		
	}
}
