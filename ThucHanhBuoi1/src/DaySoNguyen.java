import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class DaySoNguyen {
	private int [] a;
	
    private int n;
    private Scanner in =new Scanner(System.in);
    public DaySoNguyen(){
        System.out.println("nhap n= ");
        n=Integer.parseInt(in.nextLine());
        a = new int[n];
    }
    public void nhap(){
        for(int i=0;i<n;i++){
            System.out.println("Phan tu " +i+ " ");
            a[i]=Integer.parseInt(in.nextLine());
        }
    }
    public void viet(){
        System.out.println(Arrays.toString(a));
    }
    public void tong(){
        int t=0;
        for(int i=0;i<n;i++){
            t+=a[i];
        }
        System.out.println("Tong "+t);
    }
    public void TrungBinh(){
        int t=0;
        for(int i=0;i<n;i++){
            t+=a[i];
        }
        System.out.println("Trung binh "+(double)t/n);
    }
    public void sapxep(){
    	int[] b=Arrays.copyOf(a, n);
    	int[] c=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	 int t;
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
		for(int i=0;i<a.length;i++) {
			if(soNguyenTo(a[i])) {
				setC.add(a[i]);
			}
		}
		for (Integer element : setC) {
            System.out.print(element+" ");
        }
		System.out.println();
	}
    public void ktraSapXep() {
    	int[] b=Arrays.copyOf(a, n);
    	int[] c=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	int t;
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
    public void KtraDoiXung() {
    	boolean kt=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[n-i-1]) {
				kt=false;
				break;
			}
		}
    	if(kt==false) {
    		System.out.println("Mang khong doi xung");
    	}else {
    		System.out.println("Mang doi xung");
    	}
	}
    
//    public void SoLanXuatHienCuaCacPhanTu() {
//    	Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//    	for(int i=0;i<n;i++) {
//    		Dem(map, a[i]);
//		}
//    	for(Integer key:map.keySet()) {
//			System.out.printf("%d xuat hien %d lan\n", key,map.get(key));
//		}
//	}
//    public static void Dem(Map<Integer, Integer> map,int element) {
//		if(map.containsKey(element)) {
//			int count = map.get(element)+1;
//			map.put(element, count);
//		}else {
//			map.put(element, 1);
//		}
//	}
     
    
    //So lan Xuat Hien Cach 2
    
    public void SoLanXuatHienCach2() {
    	int[] b=Arrays.copyOf(a, n);
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
    
    
    
    // bai theo khuon chua dung lam
    public void DuaRaViTriPhanTuTheoKhuon() {
    	int[] b=Arrays.copyOf(a, n);
    	int[] c=Arrays.copyOf(a, n);
    	Arrays.sort(b);
    	int l=0,r=n-1,k=1;
    	System.out.println("Vi tri cac cua cac phan tu thoa man theo khuon la: ");
    	while(l<r) {
    		for(int i=0;i<n;i++ ) {
    			if(b[r]==c[i]) {
    				System.out.println("Phan tu "+c[i]+ " la so lon thu "+k+" co vi tri la: "+i);
    				c[i]=0;
    			}if(b[l]==c[i]) {
    				System.out.println("Phan tu "+c[i] + " la so nho thu "+k+" co vi tri la: "+i);
    				c[i]=0;
    			}
    		}
    		l++;
    		r--;
    		k++;
    	}for(int i=0;i<n;i++) {
    		if(c[i]!=0) {
    			System.out.println(i);
    		}
    	}
    	System.out.println();
	}
    //tim vi tri phan tu can bang
    public void timVitriCanBang() {
    	int sum=0;
    	int left=a[0];
    	boolean ok =false;
    	for(int i=0;i<n;i++){
    		sum+=a[i];
    	}
    	sum=sum-a[0];
    	for(int i=1;i<n-1;i++){
    		if(left==sum-a[i]){
    			System.out.println("Vi Tri Can Bang Can Tim la: " +(i));
    			ok=true;
    			break;
    		}
    		else{
    			left+=a[i];
    			sum-=a[i];
    		}
    		
    	}
    	if(ok==false) {
    		System.out.println("-1");
    	}
	}
    public static void main(String[] args) {
		DaySoNguyen n4=new DaySoNguyen();
		n4.nhap();
//		n4.tong();
//		n4.TrungBinh();
//		n4.sapxep();
//		n4.KtraPhanTuNguyenTo();
//		n4.ktraSapXep();
//		n4.KtraDoiXung();
//		n4.SoLanXuatHienCuaCacPhanTu();
		n4.viet();
//		n4.DuaRaViTriPhanTuTheoKhuon();
		n4.timVitriCanBang();
	}
}
