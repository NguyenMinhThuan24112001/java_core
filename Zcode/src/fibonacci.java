import java.util.Scanner;


public class fibonacci {
	public static long fibo(long n) {
		long f0=0;
		long f1=1;
		long fn=1;
		for(int i=2;i<=n;i++) {
			fn = f0+f1;
			f0=f1;
			f1=fn;
		}
		return fn;
	}
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0) {
			int n;
			n = sc.nextInt();
			System.out.println(fibo(n));
		}
		sc.close();
	}
}
