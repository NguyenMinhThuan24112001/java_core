import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Xau {
	private String xau;
	public Xau() {
	Scanner in = new Scanner(System.in);
	}
	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap xau: ");
		xau=in.nextLine();
 	}
	public void doDai() {
		System.out.println("Do dai: "+xau.length());
	}
	public void DuaRaSoTu() {
		String xau1=xau;
		String[] tu = xau1.trim().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		System.out.println(tu.length);
	}
	public void DuaRaSoCau() {
		String xau1=xau;
		String reg = "[\\.\\?\\!]+";
		String[] tu = xau1.trim().split(reg);
		System.out.println(tu.length);
	}
	public void tachTu() {
		String xau1=xau;
		String[] tu = xau1.trim().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		System.out.println(Arrays.toString(tu));
	}
	public void tachso(){
		String xau1=xau;
        String[] so=xau1.trim().toLowerCase().split("[a-z\\s\\.\\?\\!]+");
        System.out.println(Arrays.toString(so));
    }
	public void tachKiTuDacBiet(){
		String xau1=xau;
        String[] kitu=xau1.trim().toLowerCase().split("[a-z0-9\\s]+");
        System.out.println(Arrays.toString(kitu));
    }
	public void tinhTongCacSo(){
		String xau1=xau;
        String[] so=xau1.trim().toLowerCase().split("[a-z\\s\\.\\?\\!]+");
        int ans=0;
        String t="";
              for(int i=0;i<xau1.length();i++) 
              { 
                  if(xau1.charAt(i)>='0' && xau1.charAt(i)<='9') 
                  {
                        t+=xau1.charAt(i);
                   }
                     else 
                          { 
                         if(t.length()>0)
                         ans+=Integer.parseInt(t);  
                          t=""; 
                   } 
              }
                  if(t.length()>0)
                  ans+=Integer.parseInt(t);  
                  System.out.println(ans);
    }
	// dếm số lần xuất hiện của các từ trong chuỗi
//	public void DemSolanXuatHien() {
//		String xau1=xau;
//		String[] tu = xau1.trim().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
//		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
//    	for(int i=0;i<tu.length;i++) {
//    		ktraDem(map, tu[i]);
//		}
//    	for(String key:map.keySet()) {
//			System.out.printf("%s xuat hien %s lan\n", key,map.get(key));
//		}
//	}
//	public static void ktraDem(Map<String, Integer> map,String tu) {
//		if(map.containsKey(tu)) {
//			int count = map.get(tu)+1;
//			map.put(tu, count);
//		}else {
//			map.put(tu, 1);
//		}
//	}
	
	
	public void DemSolanXuatHien() {
		String xau1=xau;
		String[] tu = xau1.trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");
		int cnt=1;
		Arrays.sort(tu);
    	for(int i=1;i<tu.length;i++) {
    		if(tu[i-1].equals(tu[i])==true) {
    			++cnt;
    		}else {
    			System.out.println("\nPhan tu " + tu[i-1] + " xuat hien " + cnt + " lan!");
                cnt = 1;
    		}
    	}System.out.println("\nPhan tu " + tu[tu.length-1] + " xuat hien " + cnt + " lan!");
	}
	
	//Dua ra cac tu xuat hien tren ca hai doan
	public void duaRaCacTuXuatHienTrungNhau() {
		String xau2;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap xau thu 2: ");
		xau2=in.nextLine();
		String xau1=xau;
		String[] tu = xau1.trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");
		String[] tu2 = xau2.trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");
		int cnt=0;
		Set<String> setC = new LinkedHashSet<String>();
		System.out.println("Cac tu trung cua hai xau la: ");
		for(int i=0;i<tu.length;i++) {
			for(int j=0;j<tu2.length;j++) {
				if(tu[i].equals(tu2[j])==true) {
					setC.add(tu2[j]);
					cnt++;
				}
			}
		}
		for(String element:setC) {
			System.out.println(element+" ");
		}
		if(cnt==0) {
			System.out.println("khong co tu trung");
		}
		
	}
	public static void main(String[] args) {
		Xau x = new Xau();
		x.nhap();
		x.doDai();
		x.tachTu();
		x.DuaRaSoTu();
		x.DuaRaSoCau();
		x.tachso();
		x.tachKiTuDacBiet();
		x.tinhTongCacSo();
		x.DemSolanXuatHien();
		x.duaRaCacTuXuatHienTrungNhau();
	}
}
