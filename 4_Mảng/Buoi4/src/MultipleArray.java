
public class MultipleArray {

	public static void main(String[] args) {

		int[][] mangHaiChieu = new int[3][4];
		int[][][] mangBaChieu = new int[3][4][2];

		int[][] ints = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.println(ints[i][j]);
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(ints[i][j]);
			}
		}

	}
}
