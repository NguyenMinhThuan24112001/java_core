
public class Bai2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] = getRandomNumber(0, 10000);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Phần tử thứ " + i + " là: " + numbers[i]);
		}
		
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
