import java.util.Scanner;


public class SapXepDoiChoTrucTiep {
	public static void in(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			int n;
			n =sc.nextInt();
			int[] a = new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++) {
				System.out.print("Buoc "+(i+1) +": ");
				for(int j=i+1;j<n;j++) {
					if(a[i]>a[j]) {
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				in(a,n);
			}
			sc.close();
		
	}
}
