import java.util.Arrays;

public class ArrayCopy {

	
	public static void main(String[] args) {
		
		int[] mangA =  {-2, 2, 5, 8, 1, 0, 2, -4 };

		int[] mangB = new int[3];
		
		System.arraycopy(mangA, 0, mangB, 0, 3);
		
		for(int i =0; i< mangB.length; i++) {		
			System.out.println("Phần tử thứ " + i + " của mảng B là: ");
			System.out.println(mangB[i]);
		}
		
		
		int[] mangC = Arrays.copyOfRange(mangB, 0, 4);
		
		for(int i =0; i< mangC.length; i++) {		
			System.out.println("Phần tử thứ " + i + " của mảng C là: ");
			System.out.println(mangC[i]);
		}
		
	}
}
