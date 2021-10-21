
public class DiaChiEmail {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String reg = "^[Bb]{1}\\d{2}[a-zA-Z]{4}\\d{3}";
//		String ma;
//		while(true) {
//			System.out.println("Nhap ma: ");
//			ma=in.nextLine();
//			if(ma.matches(reg)) {
//				break;
//			}else {
//				System.err.println("nhap lai");
//			}
//		}
//		System.out.println(ma);
		String ten = "   NGuyeN MiNh       ThuAn      ".trim().toLowerCase();
		String[] tu= ten.split("\\s+");
		String t = "";
		for(int i=0;i<tu.length-1;i++) {
			t+=tu[i].charAt(0);
		}
		System.out.println(tu[tu.length-1]+t+"@ptit.edu.vn");
	}
}
