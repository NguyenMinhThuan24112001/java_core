import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {

	private float canh;

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào cạnh hình vuông");
		float canh = sc.nextFloat();
		this.canh = canh;
		super.chieuDai = canh;
		super.chieuRong = canh;
	}

	public void tinhChuVi() {
		System.out.println("Chu vi hinh chu nhat la: " + canh * 4);
	}

	public void tinhDienTich() {
		System.out.println("Dien tich hinh chu nhat la: " + canh * canh);
	}
	
}
