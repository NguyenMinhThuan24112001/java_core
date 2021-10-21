package com.t3h;

public class DaGiac2 {

	protected String ten;
	private float chuVi;
	float dienTich;

	public DaGiac2() {

	}

	public DaGiac2(String ten, float chuVi, float dienTich) {
		this.ten = ten;
		this.chuVi = chuVi;
		this.dienTich = dienTich;
	}

	protected String getTen() {
		return ten;
	}

	protected void setTen(String ten) {
		this.ten = ten;
	}

	private float getChuVi() {
		return chuVi;
	}

	protected void setChuVi(float chuVi) {
		this.chuVi = chuVi;
	}

	float getDienTich() {
		return dienTich;
	}

	protected void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaGiac [ten=").append(ten).append(", chuVi=").append(chuVi).append(", dienTich=")
				.append(dienTich).append("]");
		System.out.println(builder.toString());
		return builder.toString();
	}

	protected void getInfo() {
		System.out.println("Ten: " + ten + " chuVi: " + chuVi + " dienTich: " + dienTich);
	}
}
