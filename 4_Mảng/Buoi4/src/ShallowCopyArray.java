
public class ShallowCopyArray {
	
	
	public static void main(String[] args) {
		
		int[] mangA =  {-2, 2, 3, 8 };
		
		int[] mangB = mangA;
		
		mangB[2] = 5;
		
		System.out.println("Phần tử thứ 3 của mảng A là: " + mangA[2]);
		System.out.println("Phần tử thứ 3 của mảng B là: " + mangB[2]);

		
	}

}
