import java.util.Scanner;

public class Phantichthuasonguyento {
	public static void name(long n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				int dem=0;
				while(n%i==0) {
					dem++;
					n/=i;
				}
				System.out.print(i+"("+dem+") ");
			}
		}
		if(n>1) {
			System.out.print(n+"("+1+")");
		}
	}
	public static void main(String[] args) {
		int t;
		Scanner sc1 = new Scanner(System.in);
		t = sc1.nextInt();
		int k=1;
		while(t-->0){
			long n;
			n = sc1.nextLong();
			System.out.print("Test " + k +": ");
			name(n);
			System.out.print("\n");
			k++;
		}
		sc1.close();
	}
}
