import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListGenericExample {

	
	
	public <G, H> ListGenericExample(G g) {
		
	}
	
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Vinh");
		list1.add("Thuận");

		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(7);

		hienThiDuLieu(list1);
		hienThiDuLieu(list2);
	}
	

	public static <E> void hienThiDuLieu(List<E> list) {
		for(E e: list) {
			System.out.println(e);
		}
		
	}
}
