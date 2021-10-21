
public class ClassString {

	public static void main(String[] args) {

		String str = "abc";

		String str1 = new String("abc");

		System.out.println(str);

		System.out.println(str1);
		
		
		System.out.println("Toi ten la " + " Nam");
		String name = "Toi ten la ";
		name = name.concat(" Nam");
		System.out.println(name);

		Student student = new Student();
		System.out.println(student.toString());
		
		System.out.println(args.toString());
		
		String str2 = "abcd   !@&(*^ aydv sda 3451 sdivh tôi bạn lớp học b934g";
		
		System.out.println("So sánh chuỗi str và str2: " + str.equals(str2));

		System.out.println("Độ dài chuỗi str2 là: "+ str2.length());
		
		char ch = str2.charAt(11);
		
		System.out.println("Ký tự thứ 9 trong chuỗi str2 là : " + ch);
		
		
		int index = str2.indexOf("3");
		
		System.out.println("Chuỗi \"3\" đang ở vị trí: " + index);
		
		int lastIndex = str2.lastIndexOf("3");
		
		System.out.println("Chuỗi \"3\" cuối cùng đang ở vị trí: " + lastIndex);
		
		int index1 = str2.indexOf("sdfbdfb");
		System.out.println("Chuỗi \"sdfbdfb\" đang ở vị trí: " + index1);
		
		
		String str3 = str2.replaceAll("abcd", "3");
		System.out.println("Chuỗi sau khi replace là: " + str3);

		
		String str4 = "Hello! I am Van";
		System.out.println(str4.substring(6, str4.length()));
			
		String strTrim = "    Minh   Thuan   ";
		
		String newTrim = strTrim.trim();
		
		System.out.println(newTrim);
		
		System.out.println(newTrim.toLowerCase());
		System.out.println(newTrim.toUpperCase());
		
		String stringSplit = "Thảo Anh-Nữ-23-Hà Nội-19/11/1995";
		String[] strArray = stringSplit.split("-");
		
		for(String s : strArray) {
			System.out.println(s);
		}
		
		char[] charArray = stringSplit.toCharArray();
		
		for(char c : charArray) {
			System.out.println(c);
		}

		String token = "Barer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		if (token.startsWith("Barer ")) {
			System.out.println("Chuỗi hợp lệ");
		} else {
			System.out.println("Chuỗi không hợp lệ");
		}

		float soThuc = 1.5f;
		System.out.println("So thuc la: " + soThuc);

		String strSoThuc = String.valueOf(soThuc);
		System.out.println("Chuoi So thuc la: " + strSoThuc);

		boolean check = true;
		String strCheck = String.valueOf(check);
		System.out.println("Chuoi check la: " + strCheck);

		Student student1 = null;
		String strStudent = String.valueOf(student1);
		System.out.println("Chuoi check la: " + strStudent);

	}

}
