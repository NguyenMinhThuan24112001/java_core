import java.util.Scanner;

public class SoDep {
	private static int n;
	private Scanner in =new Scanner(System.in);
	public SoDep() {
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		System.out.println("Nhap vao so nguyen N: ");
		n = Integer.parseInt(in.nextLine());
	}
	public boolean SoThuanNghich(int n1){
       long a = n1, b = 0;
       while(a>0){
           b= b*10+a%10;
           a/=10;
       }
       if(b == n) return true;
       else return false;
    }
	private boolean ktrNT(long a) {
		for(long i=2;i<=Math.sqrt(a);i++) {
		    if(a%i==0) return false;
		}
		return a>1;
	 }
	public int SoChuSoCuaN(int n1) {
		int cnt=0;
		while(n1!=0) {
			cnt++;
			n1/=10;
		}
		return cnt;
	}
	
	//so chan
	public int CacChuSoChan(int m) {
		int cnt=0;
		while(m>0) {
			int k=m%10;
			if(k%2==0) {
				cnt++;
			}
			m/=10;
		}
//		if(SoChuSoCuaN(m)==cnt) {
//			return true;
//		}else {
//			return false;
//		}
		return cnt;
//		System.out.println(cnt);
	}
	public boolean KtraCacChuSoChan(int m) {
		if(SoChuSoCuaN(m)==CacChuSoChan(m)) {
			return true;
		}else {
			return false;
		}
	}
	public void KtraThuanNghichCacSoChan() {
		if((KtraCacChuSoChan(n))&&(SoThuanNghich(n))) {
			System.out.println("N la so thuan nghich va cac chu so deu la chan");
		}else {
			System.out.println("khong thoa man yeu cau");
		}
	}
	
	//tong chia het cho 10
	
	public int tong(int n1) {
		int m=n1;
		int sum=0;
		while(m!=0){
			sum+=m%10;
			m/=10;
		}
		return sum;
	}
	public boolean tongChiaHetCho10(int n1) {
		if(tong(n1)%10==0) {
			return true;
		}
		return false;
	}
	public boolean ketThucBatDauBang8(int n1) {
		int m=n1;
		while(m>10) {
			m/=10;
		}
		if((m==8)&&n%10==8) {
			return true;
		}
		return false;
	}
	public void KtraThuanNghichDau8Tong10() {
		if(SoThuanNghich(n)&&tongChiaHetCho10(n)&&ketThucBatDauBang8(n)) {
			System.out.println("N la so thuan nghich, chu so dau cuoi la 8 va tong chu so chia het cho 10");
		}else {
			System.out.println("khong thoa man yeu cau");
		}
	}
	
	// cac chu so nguyen to
	
	public int KtraCacChuSoNguyenTo(int m) {
		int cnt=0;
		while(m!=0) {
			int k=m%10;
			if(ktrNT(k)) {
				cnt++;
			}
			m/=10;
		}
		return cnt;
	}
	public boolean KtraCacChuSoNguyento(int m) {
		if(SoChuSoCuaN(m)==KtraCacChuSoNguyenTo(m)) {
			return true;
		}else {
			return false;
		}
	}
	public void KtraThuanNghichCacSoNguyenTo() {
		if((KtraCacChuSoNguyento(n))&&(SoThuanNghich(n))) {
			System.out.println("N la so thuan nghich va cac chu so deu la so nguyen to");
		}else {
			System.out.println("khong thoa man yeu cau");
		}
	}
	public static void main(String[] args) {
		SoDep soDep = new SoDep();
		soDep.nhap();
		soDep.KtraThuanNghichCacSoChan();
		soDep.KtraThuanNghichDau8Tong10();
		soDep.KtraThuanNghichCacSoNguyenTo();
	}
}
