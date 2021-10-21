
public class PhanSo {

	private float tuSo;
	private float mauSo;

	public PhanSo() {

	}

	public PhanSo CongPhanSo(PhanSo ps1, PhanSo ps2) {
		PhanSo ketQua = new PhanSo();
		ketQua.setTuSo(ps1.getMauSo() * ps2.getTuSo() + ps1.getTuSo() * ps2.getMauSo());
		return ketQua;
	}

	public float getTuSo() {
		return tuSo;
	}

	public void setTuSo(float tuSo) {
		this.tuSo = tuSo;
	}

	public float getMauSo() {
		return mauSo;
	}

	public void setMauSo(float mauSo) {
		this.mauSo = mauSo;
	}

}
