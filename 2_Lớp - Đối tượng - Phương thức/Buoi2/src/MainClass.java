
public class MainClass {
	
	public static void main(String[] args) {
		
//		HocSinh hocSinh = new HocSinh();
//		
//		hocSinh.setTen("Hiep");
//		hocSinh.setLop("T3h");
//		hocSinh.setDiemMonToan(9.5f);
//
//		hocSinh.layThongTinHS();
		
	
//		HocSinh hocSinh1 = new HocSinh("Vinh", "T3H", 7.0f, 6.0f, 8f);
//		hocSinh1.layThongTinHS();
//		hocSinh1.tinhDiemTrungBinh();
//
//		HocSinh hocSinh2 = new HocSinh("Hoang","T3H", 8.5f, 7.5f, 9f);
//		hocSinh2.layThongTinHS();
//		hocSinh2.tinhDiemTrungBinh();

		HocSinh hocSinh3 = new HocSinh("Truong", "T3H", 9f, 9.5f, 7f);
//		hocSinh3.layThongTinHS();
//		hocSinh3.tinhDiemTrungBinh();

		HocSinh hocSinh4 = new HocSinh("Hiêp", "T3H", 9.5f, 10f, 8f);
		hocSinh4.setDiemMonVan(8.0f);
		hocSinh4.setDiemMonNgoaiNgu(8.0f);
//		hocSinh4.layThongTinHS();
//		hocSinh4.tinhDiemTrungBinh();
		
		
		hocSinh3 = hocSinh4;
		hocSinh3.setTen("Huong");
		
		hocSinh4.layThongTinHS();
		
			
	}

}
