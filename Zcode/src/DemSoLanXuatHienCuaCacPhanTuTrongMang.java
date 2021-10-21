
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
		 
		/**
		 * Chương trình liệt kê số lần xuất hiện các phần tử trong một mảng
		 * nhập từ bàn phím trong java.
		 * 
		 * @author viettuts.vn
		 */
	public class DemSoLanXuatHienCuaCacPhanTuTrongMang {
//		    public static Scanner scanner = new Scanner(System.in);
//		     
//		    /**
//		     * main
//		     * 
//		     * @param args
//		     */
//		    public static void main(String[] args) {
//		        int t;
//		        t=scanner.nextInt();
//		        int k=1;
//		        while(t-->0) {
//		        	int n = scanner.nextInt();
//			        // khởi tạo arr
//			        int [] arr = new int [n];
//		
//			        for (int i = 0; i < n; i++) {
//			            arr[i] = scanner.nextInt();
//			        }
//			        System.out.println("Test "+k+":");
//			        // tìm số lần xuất hiện của các phần tử
//			        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//			        for (int i = 0; i < n; i++) {
//			            addElement(map, arr[i]);
//			        }
//			        for (Integer key : map.keySet()) {
//			            System.out.printf("%d xuat hien %d lan\n", key, map.get(key));
//			        }
//			        k++;
//		        }
//		    }
//		     
//		    /**
//		     * Thêm từ vào map
//		     * 
//		     * @param wordMap: map chứa các từ và số lần xuất hiện
//		     * @param sb: từ cần thêm vào wordMap
//		     */
//		    public static void addElement(Map<Integer, Integer> map, int element) {
//		        if (map.containsKey(element)) {
//		            int count = map.get(element) + 1;
//		            map.put(element, count);
//		        } else {
//		            map.put(element, 1);
//		        }
//		    }
		public static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			int t;
			t = scanner.nextInt();
			int k=1;
			while(t-->0) {
				int n;
				n = scanner.nextInt();
				int[] a = new int[n];
				Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
				for(int i=0;i<n;i++) {
					a[i] = scanner.nextInt();
				}
				System.out.println("Test "+ (k)+":");
				for(int i=0;i<n;i++) {
					ktra(map, a[i]);
				}
				for(Integer key:map.keySet()) {
					System.out.printf("%d xuat hien %d lan\n", key,map.get(key));
				}
				k++;
			}
			scanner.close();
		}
		public static void ktra(Map<Integer, Integer> map,int element) {
			if(map.containsKey(element)) {
				int count = map.get(element)+1;
				map.put(element, count);
			}else {
				map.put(element, 1);
			}
		}
}

