
public class Student {

	private String ten;
	
	private String lop;

	private float diemMonToan;
	
	private float diemMonVan;

	private float diemMonNgoaiNgu;
	
	public Student() {
	}

	public Student(String ten, String lop, float diemMonToan, float diemMonVan, float diemMonNgoaiNgu) {
		super();
		this.ten = ten;
		this.lop = lop;
		this.diemMonToan = diemMonToan;
		this.diemMonVan = diemMonVan;
		this.diemMonNgoaiNgu = diemMonNgoaiNgu;
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

	
	
}
