import java.util.Scanner;

public class MaTranChuNhat {

		private int[][] a;
		private int[][] b;
		private Scanner in=new Scanner(System.in);
		
		public int[][] getMaTran() {
			return a;
		}
		//contructor để nhập luôn kích thước ma trận
		public MaTranChuNhat() {
			System.out.println("Nhap vao so hang: ");
			int m=Integer.parseInt(in.nextLine());
			System.out.println("Nhap vao so cot: ");
			int n=Integer.parseInt(in.nextLine());
			a = new int[m][n];
		}
		public MaTranChuNhat(int m,int n) {
			a = new int[m][n];
		}
		
		public MaTranChuNhat(int[][] a) {
			this.a = a;
		}

		public void nhap() {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					System.out.println("Nhap "+i+" , "+j+" : ");
					a[i][j]=Integer.parseInt(in.nextLine());
				}
			}
		}
		public MaTran tong(int[][] b) {
			int[][] t =new int[a.length][a.length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					t[i][j]=a[i][j]+b[i][j];
				}
			}
			return new MaTran(t);
		}
		public void viet() {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(" ");
		}
		public void tongTungHang() {
			for(int i=0;i<a.length;i++) {
				int sum=0;
				System.out.println("Tong cua hang thu "+i+" la :");
				for(int j=0;j<a[0].length;j++) {
					sum+=a[i][j];
				}
				System.out.println(sum);
			}
		}
		public void timTongMax() {
			int max1=-1000000007;
			int max2=-1000000007;
			int ok=0,vtri1=0,vtri2 = 0;
			for(int i=0;i<a[0].length;i++) {
				int sum=0;
				for(int j=0;j<a.length;j++) {
					sum+=a[j][i];
				}
				if(sum>max1) {
					max1=sum;
					vtri1=i;
					ok=1;
				}
			}
			for(int i=0;i<a.length;i++) {
				int sum=0;
				for(int j=0;j<a[0].length;j++) {
					sum+=a[i][j];
				}
				if(sum>max2) {
					max2=sum;
					vtri2=i;
					ok=0;
				}
			}
		        System.out.print("Hang co tong lon nhat la: ");
		        for(int i=0;i<a[0].length;i++) {
		        	System.out.print(a[vtri2][i]+" ");
		        }
		        System.out.println("");
		        System.out.print("Cot co tong lon nhat la: ");
		        for(int i=0;i<a.length;i++) {
		        	System.out.print(a[i][vtri1]+" ");
		        }
		        System.out.println("");
		}
		public void MtCv() {
			for(int i=0;i<a[0].length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
			System.out.println(" ");
		}
		//Nhap ma tran B
//		public void MaTranB() {
//			System.out.println("Nhap vao so hang: ");
//			int m=Integer.parseInt(in.nextLine());
//			System.out.println("Nhap vao so cot: ");
//			int n=Integer.parseInt(in.nextLine());
//			b = new int[m][n];
//		}
//		public void nhapMTB() {
//			for(int i=0;i<b.length;i++) {
//				for(int j=0;j<b[0].length;j++) {
//					System.out.println("Nhap "+i+" , "+j+" : ");
//					b[i][j]=Integer.parseInt(in.nextLine());
//				}
//			}
//		}
		public int getKT() {
			return a.length;
	}
		public static void main(String[] args) {
			MaTranChuNhat mT = new MaTranChuNhat();
			mT.nhap();
			mT.viet();
			mT.tongTungHang();
			mT.timTongMax();
			mT.MtCv();
		}
}
