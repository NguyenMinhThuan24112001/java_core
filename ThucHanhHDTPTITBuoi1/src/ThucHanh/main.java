package ThucHanh;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		PhanSo p =new PhanSo();
		Xau x = new Xau();
		MaTranVuong m = null;
		while(true) {
			System.out.println("------MENU------");
			System.out.println("1.  Nhap vao phan so");
			System.out.println("2.  Hieu 2 phan so");
			System.out.println("3.  Tich 2 phan so");
			System.out.println("4.  Nhap vao xau");
			System.out.println("5.  Do dai xau");
			System.out.println("6.  Tach so");
			System.out.println("7.  Nhap ma tran vuong");
			System.out.println("8.  Dua ra cac so nguyen to");
			System.out.println("9.  Dua ra so lan xuat hien");
			int chon ;
			Scanner in = new Scanner(System.in);
			chon = in.nextInt();
			switch(chon) {
				case 0:
					System.out.println("BYE NHA!!!");
					System.exit(0);
				case 1:
					p.nhap();; 
					break;
				case 2:
					p.hieu();
					break;
				case 3:
					p.tich();
					break;
				case 4:
					x.nhap();
					break;
				case 5:
					x.tachso();
					break;
				case 6:
					x.KT();
					//x.DuaRaSoTu();
					break;
				case 7:
					m=new MaTranVuong();
					m.nhap();
					m.viet();
//					maTran=new MaTran();
//					maTran.nhap();
//					maTran.viet();
//					 h=new HaiMT();
//					 h.nhap();
//					 h.viet();
					break;
				case 8:
					m.viet();
					m.KtraPhanTuNguyenTo();
//					MaTran b=new MaTran(maTran.getKT());
//					b.nhap();
//					 MaTran t = maTran.tong(b.getMaTran());
//					 maTran.viet();
//					 b.viet();
//					 t.viet();
//					h.viet();
//					h.tong();
					break;
				case 9:
				//	n.nhap();
					break;
				default: 
					System.out.println("Hay chon tu 1-9");
					break;
			}
		}
	}
}
