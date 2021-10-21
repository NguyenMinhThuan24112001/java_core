package ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

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
	public void tachso(){
		String xau1=xau;
        String[] so=xau1.trim().toLowerCase().split("[a-z\\s\\.\\?\\!]+");
        System.out.println(Arrays.toString(so));
    }
	public boolean ktra(){
        String res="^[XN]PTIT[0-9]{2}$";
         if(xau.matches(res))
        {
           return true;
        }
        else
        {
           return false;
        }
    }
    public void KT(){
        if(ktra() == true){
            System.out.println("Xau da cho la ma kho!!!!");
        }
        else {
            System.out.println("Xau da cho khong la ma kho!!!");
        }
    }
//	public static void main(String[] args) {
//		Xau x = new Xau();
//		x.nhap();
//		x.ktraMaPhieu();
//	}
}
