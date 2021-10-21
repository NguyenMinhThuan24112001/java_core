import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	
	public static void main(String[] args) {
		
		System.out.println("Các phần tử của Set là: ");
		Set<Integer> setSoNguyen = new HashSet<>();
		setSoNguyen.add(2);
		setSoNguyen.add(5);
		setSoNguyen.add(3);
		setSoNguyen.add(9);

		Iterator<Integer> interator = setSoNguyen.iterator();
		while (interator.hasNext()) {
			System.out.println(interator.next());
		}
		
		System.out.println("Các phần tử của SortedSet là: ");
		
		SortedSet<Integer> sortedSetSoNguyen = new TreeSet<>();
		sortedSetSoNguyen.add(9);
		sortedSetSoNguyen.add(2);
		sortedSetSoNguyen.add(5);
		sortedSetSoNguyen.add(3);
		System.out.println(sortedSetSoNguyen.last());
		System.out.println(sortedSetSoNguyen.first());

		
		
		Iterator<Integer> interator1 = sortedSetSoNguyen.iterator();
		while (interator1.hasNext()) {
			System.out.println(interator1.next());
		}
		
		
		SortedSet<Integer> newSet =  sortedSetSoNguyen.headSet(5);
		System.out.println("Các phần tử của newSortedSet là: ");
		Iterator<Integer> interator2 = newSet.iterator();
		while (interator2.hasNext()) {
			System.out.println(interator2.next());
		}
	}
}
