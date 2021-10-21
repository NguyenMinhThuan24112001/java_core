import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryExample {

	public static void main(String[] args) {

		Map<String, String> mapString = new HashMap<>();
		mapString.put("D", "1");
		mapString.put("B", "2");
		mapString.put("C", "3");
		mapString.put("A", "4");
		
		mapString.put("!", "5");


		for (Map.Entry<String, String> entry : mapString.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		Set<String> setsKeyinMap = mapString.keySet();
		for (String key : setsKeyinMap) {
			System.out.println(key + "/" + mapString.get(key));
		}

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(3, "C++");
		map.put(2, "PHP");
		map.put(4, "Python");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
