import java.util.Scanner;

public class Throw {
	
	public static void main(String[] args) throws ValidateException, RuntimeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên người dùng");
		String str = sc.nextLine();
		
		if(str.length() < 3) {
			System.out.println("chuỗi đang nhỏ hơn yêu cầu");
			throw new StringIndexOutOfBoundsException();
		}
		
		char c = str.charAt(3);
		
		if(str.equals("Quang")) {
			System.out.println(" Tên không được là Quang ");
			throw new ValidateException("Tên không được là Quang");
		}
		
		System.out.println("Chương trình kết thúc");
		
	}

}
