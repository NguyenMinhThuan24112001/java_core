
public class DeepCopyArray {

	
	public static void main(String[] args) {
		
		int[] mangA =  {-2, 2, 5, 8 };

		int[] mangB = new int[4];
		
		for(int i =0; i< mangB.length; i++) {
			mangB[i] = mangA[i];
		}
		
		System.out.println("Phần tử thứ 3 của mảng A là: " + mangA[2]);
		System.out.println("Phần tử thứ 3 của mảng B là: " + mangB[2]);
		
		
		mangB[2] = 7;
		
		System.out.println("Phần tử thứ 3 của mảng A sau khi mảng B thay đổi là: " + mangA[2]);
		System.out.println("Phần tử thứ 3 của mảng B sau khi thay đổi là: " + mangB[2]);
		
		
		
	}
}
