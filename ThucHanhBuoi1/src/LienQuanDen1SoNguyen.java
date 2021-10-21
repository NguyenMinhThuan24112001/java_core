import java.util.Scanner;

public class LienQuanDen1SoNguyen {
	private int n;
	private Scanner in =new Scanner(System.in);
	public LienQuanDen1SoNguyen() {
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		System.out.println("Nhap vao so nguyen N: ");
		n = Integer.parseInt(in.nextLine());
	}
	public void tong() {
		int m=n;
		int sum=0;
		while(m!=0){
			sum+=m%10;
			m/=10;
		}
		System.out.println("Tong cac chu so cua N la: "+sum);
	}
	public void pTichNguyenTo() {
		int m=n;
		System.out.println("Phan tich N thanh cac so nguyen to sau: ");
		for(int i=2;i<=Math.sqrt(m);i++) {
			while(m%i==0) {
				System.out.print(i);
				m/=i;
				if(m!=1) {
					System.out.print("x");
				}
			}
		}
		if(m>1) {
			System.out.println(m);
		}
	}
	public void SoThuanNghich(){
        long a = n, b = 0;
       while(a>0){
           b= b*10+a%10;
           a/=10;
       }
       if(b == n) System.out.println("Có");
       else System.out.println("Không");
    }
//	public static void main(String[] args) {
//		LienQuanDen1SoNguyen n=new LienQuanDen1SoNguyen();
//		n.nhap();
//		n.tong();
//		n.pTichNguyenTo();
//	}
}
