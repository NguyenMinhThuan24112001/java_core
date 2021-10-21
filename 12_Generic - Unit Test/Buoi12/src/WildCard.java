import java.util.ArrayList;
import java.util.List;

public class WildCard<Q> {
	
//	public static Q bienQ;
	
	public static <M> void hienThiDuLieu(List<?> m) {
		
	}
	
	public static <M> void hienThiDuLieu1(List<? extends GenericExample> m) {
		
	}
	
	public static <M> void hienThiDuLieu2(List<? super ChildrenOfGenericExample> m) {
		
	}
	
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
		List<ChildrenOfGenericExample> listC = new ArrayList<>();
		hienThiDuLieu1(listC);
		
		List<GenericExample> listD = new ArrayList<>();
		hienThiDuLieu2(listD);
		
		List<?> list1 = new ArrayList<>();
		
		Object o = new Object();
		
		
		
	}
}
