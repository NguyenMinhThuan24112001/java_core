
public class Inheritance {
	
	public static void main(String[] args) {
		
		
		HinhTron hinhTron = new HinhTron();
		hinhTron.getChuVi();
		hinhTron.getDienTich();
		hinhTron.getTen();
		String ten = hinhTron.ten;
		
		HinhTron hinhTron2 = new HinhTron();
		hinhTron2.setTen("hình tròn A");
		hinhTron2.setChuVi(6.32563f);
		hinhTron2.setDienTich(9.5623f);
		
		hinhTron2.toString();
		
		HinhTron hinhTron3 = new HinhTron();
		hinhTron3.nhapBanKinh();
		hinhTron3.tinhChuVi();
		hinhTron3.tinhDienTich();
	
		hinhTron3.toString();
		
		hinhTron3.getChuVi();
		
	}
}
