import java.util.Scanner;

public class BaSoThuc {
	private double a,b,c;
	private Scanner in =new Scanner(System.in);
	public BaSoThuc() {
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		System.out.println("Nhap so thuc A: ");
		a=Double.parseDouble(in.nextLine());
		System.out.println("Nhap so thuc B: ");
		b=Double.parseDouble(in.nextLine());
		System.out.println("Nhap so thuc C: ");
		c=Double.parseDouble(in.nextLine());
	}
	public void PTBacHai() {
		double x1,x2,x3,x4,x5,x6;
		double d;
		if(a==0) {
			if(b==0&&c==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else if(b==0 && c!=0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if(b!=0) {
				x1=(double)c/b;
				System.out.println("Phuong trinh co nghiem x1 = "+x1);
			}
		}else {
			d=(double)b*b-4*a*c;
			if(d<0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if(d==0) {
				x2=(double)(-b)/(2*a);
				System.out.println("Phuong trinh co nghiem kep x1,x2 = "+(double)x2);
			}else if(d>0) {
				x3=((double)b*(-1))+(double)Math.sqrt(d);
				x4=((double)b*(-1))-(double)Math.sqrt(d);
				x5=(double)x3/(2*a);
				x6=(double)x4/(2*a);
				System.out.println("Phuong trinh co nghiem x1 = "+(double)x5);
				System.out.println("Phuong trinh co nghiem x2 = "+(double)x6);
				
			}
		}
	}
	public void DienTichTamGiac() {
		if(a+b<c||b+c<a||c+a<b) {
			System.out.println("Day khong phai la tam giac");
		}else {
			double c1;
			double p;
			double s;
			c1=(double)a+(double)b+(double)c;
			p=(double)c1/2;
			s=(double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Dien tich cua tam giac S = "+(double)s);
		}
		
	}
	public void HinhHop() {
		double c2=(double)a+(double)b+(double)c;
		System.out.println("Chu vi hinh hop = " + (double)c2*4);
		double s1=(double)a+(double)b;
		double s2=(double)c*s1;
		System.out.println("Dien tich xung quanh = "+(double)s2*2);
		double s3=(double)a*(double)b;
		System.out.println("Dien tich toan phan = "+((double)s2*2+(double)s3*2));
	}
	public static void main(String[] args) {
		BaSoThuc n3=new BaSoThuc();
		n3.nhap();
		//n3.PTBacHai();
		//n3.DienTichTamGiac();
		n3.HinhHop();
	}
	
}
