import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bai1 {

	public static void main(String[] args) {

		List<String> lists = new ArrayList<>();
		lists.add("java");
		lists.add("php");
		lists.add("java");

//		for(String str : lists) {
//			System.out.println(str);
//		}

		Set<String> sets = new HashSet<>();

		Map<String, String> maps = new HashMap<>();

		sets.add("java");
		sets.add("php");
		sets.add("java");

		for (String str : sets) {
			System.out.println(str);
		}

		maps.put("java", null);
		maps.put("php", null);
		maps.put("java", null);

		for (Map.Entry<String, String> entry : maps.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tp");
		n = sc.nextInt();
		sc.nextLine();
		SortedMap<Integer, String> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap ten quoc gia thu" + (i + 1));
			s = sc.nextLine();
			map.put(i, s);
		}
		
		
		SortedSet<String> treesets = new TreeSet<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			treesets.add(entry.getValue() + " " + entry.getKey());
		}
		
		for (String str : treesets) {
			System.out.println(str);
		}
		
		

	}
}
