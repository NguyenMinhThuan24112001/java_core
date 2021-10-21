import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DaySoThuc {
	private double [] a;
    private int n;
    private Scanner in =new Scanner(System.in);
    public DaySoThuc(){
        System.out.println("nhap n= ");
        n=Integer.parseInt(in.nextLine());
        a = new double[n];
    }
    public void nhap(){
        for(int i=0;i<n;i++){
            System.out.println("Phan tu " +i+ " ");
            a[i]=Double.parseDouble(in.nextLine());
        }
    }
    public void viet(){
        System.out.println(Arrays.toString(a));
    }
    public void tong(){
        double t=0;
        for(int i=0;i<n;i++){
            t+=a[i];
        }
        System.out.println("Tong "+t);
    }
    public void sapxep(){
        double t;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if(a[j]>a[i]){
                   t=a[i];
                   a[i]=a[j];
                   a[j]=t;
               }
            }
        }
    }  
    //Cac phan tu xuat hien 1 lan cach 2:
    public void SoLanXuatHienMotlanCach2() {
    	double[] b=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	int cnt=1;
    	for(int i=1;i<n;i++) {
    		if(b[i]==b[i-1]) {
    			++cnt;
    		}else {
    			if(cnt==1) {
    				System.out.println("\nPhan tu xuat hien 1 lan la: " + b[i-1]);
    			}
                cnt = 1;
    		}
    	}if(cnt==1) {
    		System.out.println("\nPhan tu xuat hien 1 lan la: " + b[n-1]);
    	}
	}
    
//    public void CacPhanTuXuatHienMotLan() {
//    	System.out.println("Cac phan tu xuat hien mot lan la: ");
//    	Map<Double, Integer> map = new LinkedHashMap<Double, Integer>();
//    	for(int i=0;i<n;i++) {
//    		Dem(map, a[i]);
//		}
//    	for(Double key:map.keySet()) {
//			if(map.get(key)==1) {
//				System.out.println(key+ " xuat hien "+ map.get(key)+ " lan ");
//			}
//		}
//    	System.out.println();
//	}
    
    
    
//    public void SoLanXuatHienCuaCacPhanTu() {
//    	System.out.println("Cac phan tu xuat hien la: ");
//    	Map<Double, Integer> map = new LinkedHashMap<Double, Integer>();
//    	for(int i=0;i<n;i++) {
//    		Dem(map, a[i]);
//		}
//    	for(Double key:map.keySet()) {
//    		System.out.println(key+ " xuat hien "+ map.get(key)+ " lan ");
//		}
//    	System.out.println();
//	}
//    public static void Dem(Map<Double, Integer> map,double element) {
//		if(map.containsKey(element)) {
//			int count = map.get(element)+1;
//			map.put(element, count);
//		}else {
//			map.put(element, 1);
//		}
//	}
    
    //dem so lan xuat hien cach 2:
    public void SoLanXuatHienCach2() {
    	double[] b=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	int cnt=1;
    	for(int i=1;i<n;i++) {
    		if(b[i]==b[i-1]) {
    			++cnt;
    		}else {
    			System.out.println("\nPhan tu " + b[i-1] + " xuat hien " + cnt + " lan!");
                cnt = 1;
    		}
    	}System.out.println("\nPhan tu " + b[n-1] + " xuat hien " + cnt + " lan!");
	}
    public void kiemtrasapxep(){
    	double[] b=Arrays.copyOf(a, n);
    	double[] c=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	 double t;
         for(int i=0;i<n-1;i++){
             for(int j=i+1;j<n;j++){
                if(c[j]>c[i]){
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
             }
         }
         boolean arr1=Arrays.equals(a, b);
         boolean arr2=Arrays.equals(a, c);
         if(arr1) {
        	 System.out.println("mang da duoc sap xep tang dan");
         }else if(arr2) {
        	 System.out.println("mang da duoc sap xep giam dan");
         }else {
        	 System.out.println("mang chua duoc sap xep");
         }
    	
    }
    public void sapXepTangVaGiam(){
    	double[] b=Arrays.copyOf(a, n);
    	double[] c=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	double t;
         for(int i=0;i<n-1;i++){
             for(int j=i+1;j<n;j++){
                if(c[j]>c[i]){
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
             }
         }
    	System.out.println("Mang sap xep tang dan la: "+Arrays.toString(b));
    	System.out.println("mang sap xep giam dan la: "+Arrays.toString(c));
    	System.out.println("Phan tu nho nhat la: "+b[0]);
    	System.out.println("Phan tu lon nhat la: "+b[n-1]);
    }
    
    public void MaxMin() {
    	double[] b=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	System.out.println("Phan tu nho nhat la: "+b[0]);
    	System.out.println("Phan tu lon nhat la: "+b[n-1]);
	}
    public static void main(String[] args) {
		DaySoThuc d = new DaySoThuc();
		d.nhap();
//		d.CacPhanTuXuatHienMotLan();
		//d.SoLanXuatHienCuaCacPhanTu();
		d.SoLanXuatHienMotlanCach2();
		d.SoLanXuatHienCach2();
		d.kiemtrasapxep();
		d.sapxep();
		d.tong();
		d.MaxMin();
	}
}
