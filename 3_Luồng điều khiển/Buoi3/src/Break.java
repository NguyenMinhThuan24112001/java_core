
public class Break {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		while (a < 100) {
			a++;
			System.out.println("Biến a lúc này bằng: " + a);
			if(a == 5) {
				break;
			}
		}
		
		for(int i = 1; i < 100; i++) {
			System.out.println("Biến i lúc này bằng: " + i);
			if(i == 67) {
				break;
			}

		}	
		System.out.println("Biến a bằng: " + a);
		
	}

}
