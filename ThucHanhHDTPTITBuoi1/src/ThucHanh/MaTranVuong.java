package ThucHanh;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MaTranVuong {
	private int[][] a;
	private Scanner in=new Scanner(System.in);
	public MaTranVuong() {
		System.out.println("Kich thuoc: ");
		int n=Integer.parseInt(in.nextLine());
		a = new int[n][n];
	}
	public void nhap() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println("Nhap "+i+" , "+j+" : ");
				a[i][j]=Integer.parseInt(in.nextLine());
			}
		}
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
	public static boolean soNguyenTo(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
 	}
	 public void KtraPhanTuNguyenTo() {
		    Set<Integer> setC = new LinkedHashSet<Integer>();
		    System.out.println("Cac phan tu la so nguyen to la: ");
			for(int i=0;i<(a.length);i++) {
				for(int j=0;j<a.length;j++) {
					if(soNguyenTo(a[i][j])) {
						setC.add(a[i][j]);
					}
				}
			}
			for (Integer element : setC) {
	            System.out.print(element+" ");
	        }
			System.out.println();
		}
	 public void SoLanXuatHienCach2() {
	    	int[][] b=a;
	    	int cnt=1;
	    	for(int i=0;i<b.length;i++) {
	    		for(int j=0;j<b.length-1;j++) {
	    			if(b[i][j]==b[i][j+1]) {
		    			++cnt;
		    		}else {
		    			System.out.println("\nPhan tu " + b[i][j] + " xuat hien " + cnt + " lan!");
		                cnt = 1;
		    		}
	    		}
	    	}System.out.println("\nPhan tu " + b[b.length-1][b.length-1] + " xuat hien " + cnt + " lan!");
		}
	 public void soLanXH(){
	        int[] b = new int[a.length*a.length];
	        int m = 0;
	        for(int i = 0; i < a.length ; i++){
	            for(int j = 0; j < a[0].length; j++){
	                b[m] = a[i][j];
	                m++;
	            }
	        }
	        Arrays.sort(b);
	        int[] c = new int[10000];
	        Arrays.fill(c, 0);
	        for(int i = 0; i < m;i++){
	            c[b[i]]++;
	        }
	        for(int i = 0; i < m;i++){
	            if(c[b[i]] > 0){
	                System.out.println(b[i] +  "----" + c[b[i]]);
	            }
	        }
	 }
	 public static void main(String[] args) {
		 MaTranVuong m = new MaTranVuong();
		 m.nhap();
		 m.viet();
		 m.KtraPhanTuNguyenTo();
		m.SoLanXuatHienCach2();
			//paPhanSo.tong2();
		}
}
