
public class StringPool {

	
	public static void main(String[] args) {
		
		String str = "abc";

		String str2 = "abc";
		
		String str1 = new String("abc");
		
		String str3 = new String("abc");

		
		System.out.println(str == str2);
		
		System.out.println(str == str1);

		System.out.println(str1 == str3);
		
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str1.equals(str3));



	}
	
}
