
public class Return {

	
	public static void main(String[] args) {
		
//		System.out.println("Chương trình bắt đầu chạy");
//		for(int i = 0; i < 10; i++) {
//			if(i == 7) {
//				return;
//			}
//			System.out.println("Biến i lúc này bằng: " + i);	
//		}
//		
//		System.out.println("Chương trình kết thúc");
		tinhTong();
	}
	
	public static void tinhTong() {
		System.out.println("Chương trình bắt đầu chạy");
		if(true) {
			return;
		}
	
		System.out.println("Chương trình chạy đến đây");
	}
	
}
