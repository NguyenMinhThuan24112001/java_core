import java.util.HashMap;
import java.util.Map;

public class MultiGeneric<K, V> {

	public static <K, V> void hienThiDuLieu(Map<K, V> maps) {
		for (Map.Entry<K, V> entry : maps.entrySet()) {
			System.out.println("Key " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		Map<String, Double> map1 = new HashMap<>();
		map1.put("Toán", 10.0);
		map1.put("Thuận", 10.0);
		
		Double d = map1.get("Toán");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(24, "Hoàng");
		map2.put(2, "Huy");

		Map<Character, Boolean> map3 = new HashMap<>();
		map3.put('x', true);
		map3.put('x', false);
		
		hienThiDuLieu(map1);
		hienThiDuLieu(map2);
		hienThiDuLieu(map3);
	}
	
	
	public void methodA() {
		K k;
	}

}
