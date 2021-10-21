import java.util.Iterator;
import java.util.Scanner;

public class mangdoixung {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t;
		t =sc.nextInt();
		while(t-->0) {
			long n;
			n =sc.nextLong();
			long[] mangA = new long[(int) n];
			for(int i=0;i<mangA.length;i++) {
				mangA[i]=sc.nextLong();
			}
			boolean ok = false;
			for(int i=0;i<mangA.length;i++) {
				if(mangA[i]==mangA[mangA.length-i-1]) {
					ok=true;
				}else {
					ok=false;
				}
			}
			if(ok) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}sc.close();
	}
}
