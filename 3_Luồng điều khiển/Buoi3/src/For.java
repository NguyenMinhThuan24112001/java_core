
public class For {
	
	public static void main(String[] args) {
		
		
		int a = 1;
		int dem = 0;
		for(int i = 2; a < 100; i++) {
			dem++;
			System.out.println("So i la: " + i);
			System.out.println("So a la: " + a);
			a += i;
		}
		
		
		System.out.println("Vong lặp for đã được lặp lại: " + dem + " lần");
		
		System.out.println("Chương trình kết thúc");
		
	}

}
