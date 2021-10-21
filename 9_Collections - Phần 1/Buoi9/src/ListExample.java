import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> listSoNguyen = new ArrayList<>();
		listSoNguyen.add(1);
		listSoNguyen.add(5);

		List<String> listName = new ArrayList<>();
		listName.add("Dương");
		listName.add("Hoàng");
		listName.add("Hiệp");
		listName.add("Hiệp");

		List<String> listDanhSach = new ArrayList<>();
		listDanhSach.add("Thuận");
		listDanhSach.addAll(listName);

		listDanhSach.remove(1);

		listDanhSach.set(0, "Anh Văn");

		System.out.println("Phần tử Hoàng có trong list hay không: " + listDanhSach.contains("dfbdfb"));

		Object[] mangString = listDanhSach.toArray();
		for(Object element : mangString) {
			String name = (String) element;
			System.out.println(name);
		}
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(mangString[i]);
		}

		System.out.println("Số lượng phần tử trong List " + listDanhSach.size());
		System.out.println("Kiểm tra list có trống ko: " + listDanhSach.isEmpty());

		Iterator<String> interator = listDanhSach.iterator();
		while (interator.hasNext()) {
			String name = interator.next();
			System.out.println(name);
		}

		for (String ten : listDanhSach) {
			System.out.println(ten);
		}

		for (int i = 0; i < listDanhSach.size(); i++) {
			System.out.println(listDanhSach.get(i));
		}
	}

}
