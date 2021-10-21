import java.util.Scanner;

public class UCLNBCNN {
	public static long UCLN(long a,long b) {
		while(b!=0) {
			long i=a%b;
			a=b;
			b=i;
		}return a;
	}
	public static long BCNN(long a,long b) {
		return (a*b)/UCLN(a,b);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-->0) {
			long a,b;
			a =sc.nextLong();
			b = sc.nextLong();
			System.out.printf("%d %d\n",BCNN(a, b),UCLN(a, b));
		}
	}
}
