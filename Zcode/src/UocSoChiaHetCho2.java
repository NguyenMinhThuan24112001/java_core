import java.util.Scanner;

public class UocSoChiaHetCho2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-->0) {
			long n;
			long count = 0 ;
			n =sc.nextLong();
			for(int i=1;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					if((i%2==0)&&((n/i)%2==0)) {
						count+=2;
					}else if((i%2==0)&&((n/i)%2==1)) {
						count++;
					}else if((i%2==1)&&((n/i)%2==0)) {
						count++;
					}
				}
			}
			if((Math.sqrt(n)*Math.sqrt(n)==n)&&count>=1) {
				System.out.println(count-1);
			}else {
				System.out.println(count);
			}
		}
		sc.close();
	}
}
