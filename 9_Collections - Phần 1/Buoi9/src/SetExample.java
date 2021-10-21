import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	public static void main(String[] args) {
		
		Set<String> setName = new HashSet<>();
		setName.add("Dương");
		setName.add("Hoàng");
		setName.add("Hiệp");
		setName.add("Hiệp");
		
		for (String ten : setName) {
			System.out.println(ten);
		}
		
	}
}
