import java.util.HashMap;
import java.util.Map;

public class ObjectExample {

	
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		Student student1 = new Student();
		
		Object o1 = (Object) student1;
		
		method1(1);
		
		method1(student1);
		
		method1("abc 123");

		method1(true);

		Map<String, String> hashMapString = new HashMap<>();

		method1(hashMapString);
		
		int[] mangA = new int[4];
		
		method1(mangA);
		
		method1(OtherMapExample.class);
		
		int a = 1;
		
		long b = a;
		
		long c = 2000000000000000L;
		
		int d  = (int) c;
		
		int a2 = 1;
		
	}
	
	
	public static void method1(Object o) {
		
	}
}
