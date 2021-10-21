import java.util.Scanner;

public class HinhTron extends DaGiac {
	
	private float banKinh;
	
	public void nhapBanKinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào bán kinhs");
		float banKinh = sc.nextFloat();
		this.banKinh = banKinh;
	}
	
	public void tinhChuVi() {
		super.setChuVi((float) (2 * banKinh * 3.14));
	}
	
	public void tinhDienTich() {
		super.setDienTich((float) (banKinh * banKinh * 3.14));
	}

	public String toString() {
		super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append("HinhTron [banKinh=").append(banKinh).append("]");
		System.out.println(builder.toString());
		return builder.toString();
	}
	

	public void getInfo() {
		System.out.println("banKinh: " + banKinh);
	}
	
}
