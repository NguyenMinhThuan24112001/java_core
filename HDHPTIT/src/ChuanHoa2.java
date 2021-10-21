
public class ChuanHoa2 {


		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String reg = "^[Bb]{1}\\d{2}[a-zA-Z]{4}\\d{3}";
//			String ma;
//			while(true) {
//				System.out.println("Nhap ma: ");
//				ma=in.nextLine();
//				if(ma.matches(reg)) {
//					break;
//				}else {
//					System.err.println("nhap lai");
//				}
//			}
//			System.out.println(ma);
			String ten = "   NGuyeN MiNh       ThuAn  Anh Xinh      ".trim().toLowerCase();
			String[] tu= ten.split("\\s+");
			String t = "";
			for(int i=1;i<tu.length;i++) {
				if(i==tu.length-1) {
					t+=Character.toUpperCase(tu[i].charAt(0))+tu[i].substring(1);
				}else {
					t+=Character.toUpperCase(tu[i].charAt(0))+tu[i].substring(1)+" ";
				}
			}
			System.out.println(t+", "+Character.toUpperCase(tu[0].charAt(0))+tu[0].substring(1));
		}
}
