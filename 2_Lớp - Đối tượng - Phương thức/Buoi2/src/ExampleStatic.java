
public class ExampleStatic {
	
	
	public int soA;

	public int soB;
	
	public static int soNguyenA = 10;
	
	public static int soNguyenB = 10;
	
	public static String chuoi = "abcnv";
	
	public static HocSinh hocSinh;

	
	public ExampleStatic() {
		
	}
	
	static {
		HocSinh hocSinh = new HocSinh();
		hocSinh.setTen("Trang");
		hocSinh.setLop("T3H");
	}
	
	public static int tingTong(int a, int b) {
		return (a + b);
	}
	
	public int tingTong2(int a, int b) {
		return (a + b);
	}
	
	public void layThongTin() {
		System.out.println(soNguyenA);
		layThongTin2();
	}
	
	public static void layThongTin2() {
		ExampleStatic e = new ExampleStatic();
		System.out.println(e.soA);
		
		layThongTin();
	}
	
	public static void main(String[] args) {
		System.out.println("Chuong trinh da chay vao ham main");
		layThongTin();
		layThongTin2();
	}
	
}
