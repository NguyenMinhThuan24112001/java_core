import java.util.Arrays;
import java.util.Scanner;

public class SapXepChen {
	public static void in(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-->0) {
			int n;
			n = sc.nextInt();
			int[] a = new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				in(a, i);
			}
		}
	}
}

