import java.util.Scanner;

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
	public void MtCv() {
		System.out.println("Ma tran chuyen vi la: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
	public void timTongMax() {
		int max1=-1000000007;
		int max2=-1000000007;
		int max3=-1000000007;
		int ok=0,vtri1=0,vtri2 = 0,vtri3=0;
		for(int i=0;i<a.length;i++) {
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
			for(int j=0;j<a.length;j++) {
				sum+=a[i][j];
			}
			if(sum>max2) {
				max2=sum;
				vtri2=i;
				ok=0;
			}
		}
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1+=a[i][i];
			sum2+=a[i][a.length-i-1];
		}
		System.out.println("Duong cheo co tong lon nhat la: ");
		if(sum1>=sum2) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i][i]+" ");
			}
		}else if(sum1<sum2) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i][a.length-i-1]+" ");
			}
		}
		 System.out.println("");
	        System.out.print("Hang co tong lon nhat la: ");
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[vtri2][i]+" ");
	        }
	        System.out.println("");
	        System.out.print("Cot co tong lon nhat la: ");
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[i][vtri1]+" ");
	        }
	        System.out.println("");
	}
	public void timTongMin() {
		int min1=1000000007;
		int min2=1000000007;
		int min3=1000000007;
		int ok=0,vtri1=0,vtri2 = 0,vtri3=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[j][i];
			}
			if(sum<min1) {
				min1=sum;
				vtri1=i;
				ok=1;
			}
		}
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[i][j];
			}
			if(sum<min2) {
				min2=sum;
				vtri2=i;
				ok=0;
			}
		}
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1+=a[i][i];
			sum2+=a[i][a.length-i-1];
		}
		System.out.println("Duong cheo co tong nho nhat la: ");
		if(sum1<=sum2) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i][i]+" ");
			}
		}else if(sum1>sum2) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i][a.length-i-1]+" ");
			}
		}
		 System.out.println("");
	        System.out.print("Hang co tong nho nhat la: ");
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[vtri2][i]+" ");
	        }
	        System.out.println("");
	        System.out.print("Cot co tong nho nhat la: ");
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[i][vtri1]+" ");
	        }
	        System.out.println("");
	}
	public void MaTranDoiXung() {
		boolean ok=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]!=a[j][i]) {
					ok=false;
					break;
				}
			}
		}
		if(ok) {
			System.out.println("Ma tran doi xung");
		}else {
			System.out.println("Ma tran khong doi xung");
		}
	}
	//Dinh Thuc cua ma tran
	public int DinhThucmaTran(int[][] b, int n) {
		int s,sum=0;
		if(n==1) return b[0][0]; 
		if(n==2) return (b[0][0]*b[1][1]-b[0][1]*b[1][0]);
		for(int k=0;k<b.length;k++) {
			int[][] smaller=new int[b.length][b.length];
			for(int i=0;i<b.length;i++) {
				for(int j=1;j<b.length;j++) {
					if(i<k) smaller[i][j-1]=b[i][j];
					else if(i>k) smaller[i-1][j-1]=b[i][j];
				}
			}
			if(k%2==0) s=1;
			else s=-1;
			sum+=b[k][0]*s*DinhThucmaTran(smaller,n-1);
		}
		return sum;
	}
	public void InDinhThuc() {
		int k=DinhThucmaTran(a, a.length);
		System.out.println("Dinh thuc cua ma tran la: "+k);
	}
	public static void main(String[] args) {
		MaTranVuong mTv=new MaTranVuong();
		mTv.nhap();
		mTv.viet();
		mTv.MtCv();
		mTv.timTongMax();
		mTv.timTongMin();
		mTv.MaTranDoiXung();
		mTv.InDinhThuc();
	}
}
