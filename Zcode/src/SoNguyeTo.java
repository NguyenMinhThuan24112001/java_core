import java.util.Scanner;
public class SoNguyeTo {
	public static boolean soNguyenTo(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
 	}
	public static void main(String[] args) {
		int t;
		Scanner sc1 = new Scanner(System.in);
		t = sc1.nextInt();
		while(t-->0) {
			int n;
			n = sc1.nextInt();
			if(soNguyenTo(n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc1.close();
	}
}
