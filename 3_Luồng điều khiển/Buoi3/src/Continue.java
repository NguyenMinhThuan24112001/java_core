
public class Continue {

	
	public static void main(String[] args) {
		
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Vòng lặp đã được thực hiện lại");
			if(i == 2 || i == 9) {
				continue;
			}
			System.out.println("Biến i lúc này bằng: " + i);
		}
	}
}
