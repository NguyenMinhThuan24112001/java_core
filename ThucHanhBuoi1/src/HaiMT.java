import java.util.Scanner;



public class HaiMT {
	 private int[][] a;
	 private int[][] b;
	 private Scanner in =new Scanner(System.in);
	public HaiMT() {
		System.out.println("Kich thuoc: ");
		int n=Integer.parseInt(in.nextLine());
		a = new int[n][n];
		b = new int[n][n];
	}
	public void nhap() {
		System.out.println("Nhap ma tran 1 : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println("Nhap "+i+" , "+j+" : ");
				a[i][j]=Integer.parseInt(in.nextLine());
			}
		}
		System.out.println("Nhap ma tran 2 : ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.println("Nhap "+i+" , "+j+" : ");
				b[i][j]=Integer.parseInt(in.nextLine());
			}
		}
	}
	public void viet() {
		System.out.println("Ma tran 1: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Ma tran 2: ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void tong() {
		int[][] t =new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				t[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Ma tran tong: ");
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void hieu() {
		int[][] h =new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				h[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Ma tran hieu: ");
		for(int i=0;i<h.length;i++) {
			for(int j=0;j<h.length;j++) {
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void tich() {
		int[][] c =new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Ma tran tich: ");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		HaiMT h2 = new HaiMT();
		h2.nhap();
		h2.viet();
		h2.tong();
		h2.hieu();
		h2.tich();
	}
}
