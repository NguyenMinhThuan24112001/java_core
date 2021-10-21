
public class MainClass2 {

	
	public static void main(String[] args) {
		
		
		
//		HocSinh hocSinh = new HocSinh();
//		hocSinh.setTen("Giang");
//		
//		System.out.println("Ten hoc sinh la: " + hocSinh.getTen());
		
//		HocSinh hocSinh1 = new HocSinh();
		
//		String gioiTinhHS1 = hocSinh1.getGioiTinh();
//		System.out.println("Gioi tinh cua hocsinh1 la: " + gioiTinhHS1);
		
		
//		String gioiTinhNam = "Nam";
//		hocSinh1.setGioiTinh(gioiTinhNam);
//		System.out.println("Gioi tinh cua hocsinh1 sau khi set la: " + hocSinh1.getGioiTinh());
		
//		hocSinh1.setGioiTinh("Nu");
//		System.out.println("Gioi tinh cua hocsinh1 sau khi set lan 2 la: " + hocSinh1.getGioiTinh());
	
//		
//		phuongThuc1("abc", 20, hocSinh1);
		
		int tong = tingTong(5, 7);
		System.out.println("Tong la: " + tong);
		tong = tingTong(6, 9);
		System.out.println("Tong la: " + tong);
		
		HocSinh hs = phuongThuc3("Vinh", "T3H");
		hs.layThongTinHS();

	}
	
	public static void phuongThuc1(String a, int b, HocSinh c) {
		// Code
		System.out.println("Gia tri bien a: " + a);
		
		c.layThongTinHS();
		
	}
	
	public static int tingTong(int a, int b) {
		return (a + b);
	}
	
	public static HocSinh phuongThuc3(String ten, String lop) {
		HocSinh hocSinh = new HocSinh();
		hocSinh.setTen(ten);
		hocSinh.setLop(lop);
		return hocSinh;
	}
}
