
public class While {

	public static void main(String[] args) {
		int dem = 0;
		boolean checkSoA = true;
		while (checkSoA) {
			dem++;
			int a = getRandomNumber(0, 100);
			System.out.println("So may man: " + a);
			if(a == 61) {
				checkSoA = false;
			}
		}
		
		System.out.println("So ngay da choi la: " + dem);

	}

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
