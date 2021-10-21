import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DaySoThuc d=null;
		Xau x = new Xau();
		//MaTran maTran= null;
		HaiMT h =null;
		SoNguyenN n =new SoNguyenN();
		LienQuanDen1SoNguyen n1 = new LienQuanDen1SoNguyen();
		while(true) {
			System.out.println("------MENU------");
			System.out.println("1.  Nhap vao day so");
			System.out.println("2.  Tong");
			System.out.println("3.  Sap xep");
			System.out.println("4.  Nhap vao xau");
			System.out.println("5.  Do dai xau");
			System.out.println("6.  Tach tu");
			System.out.println("7.  Nhap ma tran");
			System.out.println("8.  Tong ma tran");
			System.out.println("9.  Nhap vao so nguyen N");
			System.out.println("10. Liet ke so nguyen to");
			System.out.println("11. Liet ke so thuan nghich");
			int chon ;
			Scanner in = new Scanner(System.in);
			chon = in.nextInt();
			switch(chon) {
				case 0:
					System.out.println("BYE NHA!!!");
					System.exit(0);
				case 1:
					d=new DaySoThuc();
					d.nhap(); 
					break;
				case 2:
					d.viet();
					d.tong();
					break;
				case 3:
					d.viet();
					d.sapxep();
					d.viet();
					break;
				case 4:
					x.nhap();
					break;
				case 5:
					x.doDai();
					break;
				case 6:
					x.tachTu();
					//x.DuaRaSoTu();
					break;
				case 7:
//					maTran=new MaTran();
//					maTran.nhap();
//					maTran.viet();
					 h=new HaiMT();
					 h.nhap();
					 h.viet();
					break;
				case 8:
//					MaTran b=new MaTran(maTran.getKT());
//					b.nhap();
//					 MaTran t = maTran.tong(b.getMaTran());
//					 maTran.viet();
//					 b.viet();
//					 t.viet();
					h.viet();
					h.tong();
					break;
				case 9:
					n.nhap();
					break;
				case 10:
					n.kquaNT();
					break;
				case 11:
					n.kquaThuanNghich();
					break;
				case 12:
					n1.nhap();
					break;
				case 13:
					n1.tong();
					break;
				case 14:
					n1.pTichNguyenTo();
					break;
				case 15:
					n1.SoThuanNghich();
					break;
				case 16:
					n.nhap();
					break;
				case 17:
					n.nhap();
					break;
				default: 
					System.out.println("Hay chon tu 1-9");
					break;
			}
		}
	}
}
