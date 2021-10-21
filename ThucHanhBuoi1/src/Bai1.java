import java.util.Scanner;



public class Bai1 {
	static long mod =1000000007;
	public static void nhapVaoSoN(long n) {
		Scanner in1 = new Scanner(System.in);
		n = in1.nextLong();
	}
	public static void Tong(long n) {
		long sum=0L;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Tong tu 1 den N la "+sum);
	}
	public static void Tich(long n) {
		long giaiThua=1L;
		for(int i=1;i<=n;i++) {
			giaiThua=giaiThua*i;
			giaiThua%=mod;
		}
		System.out.println("Tich tu 1 den N la "+giaiThua);
	}
	public static void TongChan(long n) {
		long sum=0L;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Tong chẵn tu 1 den N la "+sum);
	}
	public static void TongLe(long n) {
		long sum=0L;
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("Tong lẻ tu 1 den N la "+sum);
	}
	public static long timSoFiboThuN(long n) {
		if(n==1||n==2) {
			return 1;
		}
		return timSoFiboThuN(n-1)+timSoFiboThuN(n-2);
	}
	public static boolean soNguyenTo(long n) {
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
	public static long fibo(long n) {
		long f0=0;
		long f1=1;
		long fn=1;
		for(int i=2;i<=n;i++) {
			fn = f0+f1;
			f0=f1;
			f1=fn;
		}
		return fn;
	}
	public static long init(int n){
		long[] f=new long[93];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=92;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
	public static boolean ktrafibo(long n){
		for(int i=1;i<=n;i++)
		if(n==init(i)){
			return true;
		}
		return false;
	}
	public static void sinhNhiPhan(long n) {
		long[] a = new long[10000];
		boolean ok = true;
		for(int i=1;i<=n;i++) {
			a[i]=0;
		}while(ok) {
			for(int i=1;i<=n;i++) {
				System.out.print(a[i]);
			}System.out.print(" ");
			
			long i=n;
			while(i>0&&a[(int) i]==1) {
				a[(int) i]=0;
				i--;
			}if(i==0) {
				ok=false;
			}else {
				a[(int) i]=1;
			}
		}
	}
	public static void sinhHoanVi(long n) {
		long[] a = new long[10000];
		boolean ok = true;
		for(int i=1;i<=n;i++) {
			a[i]=i;
		}while(ok) {
			for(int i=1;i<=n;i++) {
				System.out.print(a[i]);
			}System.out.print(" ");
			
			long i=n-1;
			while(i>=1&&a[(int) i]>a[(int) (i+1)]) {
				i--;
			}if(i==0) {
				ok=false;
			}else {
				long k=n;
				while(a[(int) i]>a[(int)k]){
		    		k--;
				}
				long temp =a[(int)i];
				a[(int) i]=a[(int)k];
				a[(int)k]=temp;
				int l=(int) (i+1);
				int r=(int) n;
				while(l<r){
					long temp1 =a[(int)l];
					a[(int) l]=a[(int)r];
					a[(int)r]=temp1;
					l++;
					r--;
				}
			}
		}
	}
	public static void main(String[] args) {
		long n =0 ;
		System.out.println("------MENU------");
		System.out.println("1.  Lua Chon 1");
		System.out.println("2.  Lua Chon 2");
		System.out.println("3.  Lua Chon 3");
		System.out.println("4.  Lua Chon 4");
		System.out.println("5.  Lua Chon 5");
		System.out.println("6.  Lua Chon 6");
		System.out.println("7.  Lua Chon 7");
		System.out.println("8.  Lua Chon 8");
		System.out.println("9.  Lua Chon 9");
		System.out.println("10. Lua Chon 10");
		System.out.println("11. Lua Chon 11");
		System.out.println("12. Lua Chon 12");
		System.out.println("13. Lua Chon 13");
		System.out.println("14. Lua Chon 14");
		System.out.println("15. Lua Chon 15");
		System.out.println("16. Lua Chon 16");
		System.out.println("17. Lua Chon 17");
		System.out.println("18. Lua Chon 18");
		while(true) {
			int chon ;
			Scanner in = new Scanner(System.in);
			chon = in.nextInt();
			switch(chon) {
				case 0:
					System.out.println("BYE NHA!!!");
					System.exit(0);
				case 1:
					System.out.println("ban chon 1");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					System.out.println("Gia Tri Cua N la: " +n);
					break;
				case 2:
					System.out.println("ban chon 2");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					Tong(n);
					break;
				case 3:
					System.out.println("ban chon 3");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					Tich(n);
					break;
				case 4:
					System.out.println("ban chon 4");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					TongChan(n);
					break;
				case 5:
					System.out.println("ban chon 5");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					TongLe(n);
					break;
				case 6:
					System.out.println("ban chon 6");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 7:
					System.out.println("ban chon 7");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 8:
					System.out.println("ban chon 8");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 9:
					System.out.println("ban chon 9");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 10:
					System.out.println("ban chon 10");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 11:
					System.out.println("ban chon 11");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					System.out.println("So Fibo thu:"+(n)+"la: "+(timSoFiboThuN(n)));
					break;
				case 12:
					System.out.println("ban chon 12");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					System.out.println("cac so fibo nho hon n la");
					for(int i=0;i<=n;i++) {
						if(ktrafibo(i)) {
							System.out.print((i)+" ");
						}
					}
					break;
				case 13:
					System.out.println("ban chon 13");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					int ok=0;
					System.out.println("cac so fibo nho hon n va la so nguyen to la: ");
					for(int i=0;i<=n;i++) {
						if(ktrafibo(i)&&soNguyenTo(i)) {
							System.out.print((i)+" ");
							ok++;
						}
					}
					if(ok==0) {
						System.out.println("Khong co so thoa man");
					}
					break;
				case 14:
					System.out.println("ban chon 14");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					sinhNhiPhan(n);
					break;
				case 15:
					System.out.println("ban chon 15");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					sinhHoanVi(n);
					break;
				case 16:
					System.out.println("ban chon 16");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 17:
					System.out.println("ban chon 17");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				case 18:
					System.out.println("ban chon 18");
					System.out.println("Nhap vao N: ");
					n=in.nextLong();
					break;
				default: 
					System.out.println("Hay chon tu 1-18");
					break;
			}
		}
	}
}
