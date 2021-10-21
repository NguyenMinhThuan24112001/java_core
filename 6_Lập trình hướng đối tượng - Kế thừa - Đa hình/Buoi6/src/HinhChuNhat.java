import java.util.Scanner;

public class HinhChuNhat extends DaGiac {

	public float chieuDai;
	public float chieuRong;

	public HinhChuNhat() {
	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat(String ten, float chuVi, float dienTich, float chieuDai, float chieuRong) {
		super(ten, chuVi, dienTich);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài");
		float chieuDai = sc.nextFloat();
		this.chieuDai = chieuDai;

		System.out.println("Nhập vào chiều rộng");
		float chieuRong = sc.nextFloat();
		this.chieuRong = chieuRong;
	}

	public void tinhChuVi() {
		System.out.println("Chu vi hinh chu nhat la: " + (chieuDai + chieuRong) * 2);
	}

	public void tinhDienTich() {
		System.out.println("Dien tich hinh chu nhat la: " + chieuDai * chieuRong);
	}

	public String toString() {
		super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append("HinhChuNhat [chieuDai=").append(chieuDai).append(", chieuRong=").append(chieuRong).append("]");
		System.out.println(builder.toString());

		return builder.toString();
	}

	public HinhChuNhat getHinhChuNhat() {
		changeHinhChuNhat(this);
		return this;
	}

	public void changeHinhChuNhat(HinhChuNhat chuNhat) {

	}

	public void getInfo() {
		System.out.println("chieuDai: " + chieuDai + 
				" chieuRong: " + chieuRong);
	}
}
