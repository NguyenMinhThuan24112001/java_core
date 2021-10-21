import java.util.Scanner;

public class KiemTraMaTranCon {
	private int[][] a;
	private Scanner in=new Scanner(System.in);
	public KiemTraMaTranCon() {
		System.out.println("Nhap vao ma tran A");
		System.out.println("Nhap vao so hang ma tran A: ");
		int m=Integer.parseInt(in.nextLine());
		System.out.println("Nhap vao so cot ma tran A: ");
		int n=Integer.parseInt(in.nextLine());
		a = new int[m][n];
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
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
	public void nhapB() {
		System.out.println("Nhap vao ma tran B");
		System.out.println("Nhap vao so hang ma tran B: ");
		int k=Integer.parseInt(in.nextLine());
		System.out.println("Nhap vao so cot ma tran B: ");
		int l=Integer.parseInt(in.nextLine());
		int[][] b = new int[k][l];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.println("Nhap "+i+" , "+j+" : ");
				b[i][j]=Integer.parseInt(in.nextLine());
			}
		}
		if(maTranCon(b, k, l)) {
			System.out.println("ma tran B la con cua ma tran A");
		}else {
			System.out.println("ma tran B khong la con cua ma tran A");
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
	public boolean maTranCon(int[][] b,int k,int l) {

	    int hangA, cotA;
	    int hangB, cotB;
	    boolean flg;
	    int cnt = 0;
	 
	    for (hangA = 0; hangA <=a.length-k; hangA++)
	    {
	        for (cotA = 0; cotA <=a[0].length-l; cotA++)
	        {
	            flg = true;
	            for (hangB = 0; hangB < k; hangB++)
	            {
	                for (cotB = 0; cotB < l; cotB++)
	                {
	                    if (b[hangB][cotB] != a[hangA + hangB][cotA + cotB])
	                    {
	                        flg = false;
	                        break;
	                    }
	                }
	                if (flg == false)
	                {
	                    break;
	                }
	            }
	            if (flg == true)
	            {
	                cnt++;
	            }
	        }
	    }
	 
	    return (cnt > 0);
	}
	public static void main(String[] args) {
		KiemTraMaTranCon k =new KiemTraMaTranCon();
		k.nhap();
		k.nhapB();
		k.viet();
	}
}
