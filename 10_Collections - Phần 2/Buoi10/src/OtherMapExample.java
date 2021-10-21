import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class OtherMapExample {
	
	
	public static void main(String[] args) {
		
		Map<String, String> hashMapString = new HashMap<>();
		
		Map<String, String> hashTableString = new Hashtable<>();
		
		HashMap<String, String> hashMapString1 = new HashMap<>();
		
		HashMap<String, String> linkedHashMap = new LinkedHashMap<>();

		Map<String, String> concurrentMap = new ConcurrentHashMap<>();
		
		Map<String, String> treeMap = new TreeMap<>();

//		if(hashMapString.get("34riunfi3u4f") != null) {
//			hashMapString.put("34riunfi3u4f", "Có giá trị rồi");
//		}		
//		
		
		treeMap.put(null, null);
		
		hashMapString.put(null, null);
		
	}

}
