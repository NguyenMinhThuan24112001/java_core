import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> lists = new ArrayList<>();
		Map<String, Integer> mapInteger = new HashMap<>();
		Map<String, String> mapString = new HashMap<>();

		mapString.put("Nam", "Tên tôi là Nam, 17 tuổi");
		mapString.put("Nam", "xvfvdfvdfv");
		mapString.put("Nam", "123456");
		mapString.put("Hoa", "Tôi là Hoa");

		mapString.put(null, "Tôi là Trường");

		mapString.put(null, null);

		String value = mapString.get("Nam");

		System.out.println(value);
		System.out.println(mapString.get("Hoa"));

		System.out.println(mapString.get("ABC"));

		System.out.println(mapString.get(null));

		mapString.remove("Nam");
		System.out.println(mapString.get("Nam"));

		mapString.put("A", "1");

		mapString.put("B", "2");
		mapString.put("C", "1");
		Set<String> setsKeyinMap = mapString.keySet();
		for (String key : setsKeyinMap) {
			System.out.println("Khóa của map là:" + key);
		}
		
		System.out.println(mapString.isEmpty());
		
		System.out.println("Số phần tử trong map là: " + mapString.size());

	}
}
