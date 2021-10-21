import java.util.Scanner;

public class MaTran {
	private int[][] a;
	private Scanner in=new Scanner(System.in);
	
	public int[][] getMaTran() {
		return a;
	}
	//contructor để nhập luôn kích thước ma trận
	public MaTran() {
		System.out.println("Kich thuoc: ");
		int n=Integer.parseInt(in.nextLine());
		a = new int[n][n];
	}
	public MaTran(int n) {
		a = new int[n][n];
	}
	
	public MaTran(int[][] a) {
		this.a = a;
	}

	public void nhap() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println("Nhap "+i+" , "+j+" : ");
				a[i][j]=Integer.parseInt(in.nextLine());
			}
		}
	}
	public MaTran tong(int[][] b) {
		int[][] t =new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				t[i][j]=a[i][j]+b[i][j];
			}
		}
		return new MaTran(t);
	}
	public void viet() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
	public int getKT() {
		return a.length;
	}
}
