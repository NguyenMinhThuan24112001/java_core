
public class Constructor {

	
	public static void main(String[] args) {
		
//		DaGiac daGiac = new DaGiac("Hình A", 10f, 20f);
//		daGiac.toString();
//		HinhChuNhat hinhChuNhat = new HinhChuNhat(6f, 8f);
//		hinhChuNhat.toString();
		
		
		HinhChuNhat hinhChuNhat1 = 
				new HinhChuNhat("HCN A", (6+8)*2f, 6*8f, 6f, 8f);
		
		hinhChuNhat1.toString();

		int a = 1;
		long b = 1;
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);

			
	}
	
	
	public void methodB() {
		this.methodA();
	}
	
	public void methodA() {
		
	}
}
