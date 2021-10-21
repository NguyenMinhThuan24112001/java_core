import java.util.Scanner;

public class HaiSoNguyen {
	private int m,n;
	private Scanner in =new Scanner(System.in);
	public HaiSoNguyen() {
		
	}
	public void nhap2so() {
		System.out.println("Nhap so nguyen M: ");
		m=Integer.parseInt(in.nextLine());
		System.out.println("Nhap so nguyen N: ");
		n=Integer.parseInt(in.nextLine());
	}
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
	public void inUCBC() {
		System.out.println("UCLN cua M va N la: "+UCLN(m, n));
		System.out.println("BCNN cua M va N la: "+BCNN(m, n));
	}
	private boolean ktrNT(long a) {
		for(long i=2;i<=Math.sqrt(a);i++) {
		    if(a%i==0) return false;
		}
		return a>1;
	 }
	public void SoNguyenToTrongDoanMN() {
		System.out.println("Cac so nguyen to trong doan MN la: ");
		for(int i=Math.min(n, m);i<=Math.max(n, m);i++) {
			if(ktrNT(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
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
	public void SoThuanNghichTrongDoanMN() {
		System.out.println("Cac so thuan nghich trong doan MN la: ");
		for(int i=Math.min(n, m);i<=Math.max(n, m);i++) {
			if(SoThuanNghich(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		HaiSoNguyen n2=new HaiSoNguyen();
		n2.nhap2so();
		n2.inUCBC();
		n2.SoNguyenToTrongDoanMN();
		n2.SoThuanNghichTrongDoanMN();
	}
}
