import java.util.Scanner;

public class SoNguyenN {
	private int n;
	private Scanner in =new Scanner(System.in);
	public void SoNguyenN() {
		
	}
	public void nhap() {
		System.out.println("Nhap vao so nguyen N: ");
		n = Integer.parseInt(in.nextLine());
	}
	private boolean ktrNT(long a) {
		for(long i=2;i<=Math.sqrt(a);i++) {
		    if(a%i==0) return false;
		}
		return a>1;
	 }
	public boolean SoThuanNghich(long n){
        long a = n, b = 0;
       while(a>0){
           b= b*10+a%10;
           a/=10;
       }
       if(b == n) return true;
       else return false;
    }
	public void kquaNT() {
		System.out.println("Cac so nguyen to co N chu so: ");
		for(int i = (int) Math.pow(10, n-1);i<=Math.pow(10, n);i++) {
			if(ktrNT(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public void kquaThuanNghich() {
		System.out.println("Cac so thuan nghich co N chu so: ");
		for(int i = (int) Math.pow(10, n-1);i<=Math.pow(10, n);i++) {
			if(SoThuanNghich(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
