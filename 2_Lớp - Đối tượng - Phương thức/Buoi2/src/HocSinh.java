
public class HocSinh {

	private String ten;
	
	private String lop;

	private float diemMonToan;
	
	private float diemMonVan;

	private float diemMonNgoaiNgu;
	
	private String gioiTinh;
	
	private String diaChi;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String ten, String lop, float diemMonToan) {
		this.ten = ten;
		this.lop = lop;
		this.diemMonToan = diemMonToan;
	}
	
	public HocSinh(String ten, String lop, float diemMonToan, 
			float diemMonVan, float diemMonNgoaiNgu) {
		this.ten = ten;
		this.lop = lop;
		this.diemMonToan = diemMonToan;
		this.diemMonVan = diemMonVan;
		this.diemMonNgoaiNgu = diemMonNgoaiNgu;
	}
	
	public void layThongTinHS () {
		System.out.println("Ten: " + ten + " Lop: " + lop + 
				" Diem toan: " + diemMonToan + 
				" Diem van: " + diemMonVan +
				" Diem ngoai ngu: " + diemMonNgoaiNgu);
	}
			
	public void tinhDiemTrungBinh() {
		float diemTrungBinh = (diemMonToan + diemMonVan + diemMonNgoaiNgu) / 3;		
		System.out.println("Diem trung binh cua hoc sinh " + ten + " la: " + diemTrungBinh);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float getDiemMonToan() {
		return diemMonToan;
	}

	public void setDiemMonToan(float diemMonToan) {
		this.diemMonToan = diemMonToan;
	}

	public float getDiemMonVan() {
		return diemMonVan;
	}

	public void setDiemMonVan(float diemMonVan) {
		this.diemMonVan = diemMonVan;
	}

	public float getDiemMonNgoaiNgu() {
		return diemMonNgoaiNgu;
	}

	public void setDiemMonNgoaiNgu(float diemMonNgoaiNgu) {
		this.diemMonNgoaiNgu = diemMonNgoaiNgu;
	}
	
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
	
}
