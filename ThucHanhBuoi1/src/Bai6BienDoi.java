import java.util.Scanner;

public class Bai6BienDoi {
	 private double x;
	    private double epsilon;
	    private long n;
	 
	    public Bai6BienDoi(){
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("Nhap so thuc x = ");
	        x = sc.nextDouble();
	        System.out.print("Nhap so thuc epsilon = ");
	        epsilon = sc.nextDouble();
	        System.out.println("x = "+x+"\nepsilon = "+epsilon);
	    }
	    private double tu(int k){
	       double sum=1;
	        for (int i = 0; i < k; i++) {
	            sum*=x;
	        }
	        return sum;
	    }
	    private double mau(int k){
	        double sum = 1;
	        for (int i = 1; i <= k; i++) {
	            sum*=i;
	        }
	        return sum;
	    }
	    public void sinX(){
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("nhap n = ");
	        n = sc.nextInt();
	        double sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum+=((double)(tu(2*i+1)/mau(2*i+1)));
	        }
	        System.out.println("SinX = "+sum);
	    }
	    public void CosX(){
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("nhap n = ");
	        n = sc.nextInt();
	        double sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum+=((double)(tu(2*(i-1))/mau(2*(i-1))));
	        }
	        System.out.println("CosX = "+sum);
	    }
	    public static void main(String[] args) {
			Bai6BienDoi b6= new Bai6BienDoi();
			b6.sinX();
			b6.CosX();
		}
}
