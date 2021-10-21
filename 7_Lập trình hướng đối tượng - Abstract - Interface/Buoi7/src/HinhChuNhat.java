import java.util.Scanner;

public class HinhChuNhat implements HinhHoc {

	public static final String TEN_INTERFACE = "HinhHoc";
	
	private float chieuDai;

	private float chieuRong;

	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài");
		float chieuDai = sc.nextFloat();
		this.chieuDai = chieuDai;

		System.out.println("Nhập vào chiều rộng");
		float chieuRong = sc.nextFloat();
		this.chieuRong = chieuRong;
	}

	@Override
	public void tinhDienTich() {
		System.out.println("Dien tich hinh chu nhat la: " + chieuDai * chieuRong);
	}

	@Override
	public void tinhChuVi() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		
	}
	
	

}
