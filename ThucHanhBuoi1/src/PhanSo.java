import java.util.Scanner;

public class PhanSo {
	private int a1,a2;
	private int b1,b2;
	private Scanner in =new Scanner(System.in);
	public PhanSo() {
		
	}
	public void nhap() {
		System.out.println("Nhap tu so phan so 1: ");
		a1=Integer.parseInt(in.nextLine());
		System.out.println("Nhap mau so phan so 1: ");
		a2=Integer.parseInt(in.nextLine());
		System.out.println("Nhap tu so phan so 2: ");
		b1=Integer.parseInt(in.nextLine());
		System.out.println("Nhap mau so phan so 2: ");
		b2=Integer.parseInt(in.nextLine());		
	}
	public int ucln(int t1,int t2) {
		while(t2!=0) {
			int i=t1%t2;
			t1=t2;
			t2=i;
		}return t1;
	}
	public void tong(){
		 int tich = b2*a2;
         int tong = a1*b2+b1*a2;
         int cost = 0;
         if(tong < 0){
             cost = 1;
             tong = tong*-1;
         }
         int uc = ucln(tich,tong);
         //System.out.println(uc);
         if(cost==1) tong = -tong/uc;
         else tong = tong/uc;
         tich = tich/uc;
         if(tich != 1) {
             if(tich<0) {
           	  tong=tong*(-1);
           	  tich=tich*(-1);
           	  System.out.println("A + B = "+tong+"/"+tich);
             }else {
           	  System.out.println("A + B = "+tong+"/"+tich);
             }
         }else {
        	 System.out.println("A + B = "+tong);
         }
    }
    public void hieu(){
        int tich = b2*a2;
        int hieu = a1*b2-b1*a2;
        int cost = 0;
        if(hieu < 0){
            cost = 1;
            hieu = hieu*-1;
        }
        int uc = ucln(tich,hieu);
        if(cost==1) hieu = -hieu/uc;
        else hieu = hieu/uc;
        tich = tich/uc;
        if(tich != 1) {
            if(tich<0) {
            	hieu=hieu*(-1);
          	  tich=tich*(-1);
          	  System.out.println("A - B = "+hieu+"/"+tich);
            }else {
          	  System.out.println("A - B = "+hieu+"/"+tich);
            }
        }else {
       	 System.out.println("A - B = "+hieu);
        }
    }
    public void tich() {
		int tu=a1*b1;
		int mau=a2*b2;
		int uc=ucln(tu, mau);
		int cost = 0;
	      if(tu < 0){
	         cost = 1;
	         tu = tu*-1;
	     }
	        //System.out.println(uc);
	    if(cost==1) tu = -tu/uc;
	    else tu = tu/uc;
	    mau = mau/uc;
	    if(mau != 1) {
            if(mau<0) {
            	tu=tu*(-1);
            	mau=mau*(-1);
          	  System.out.println("A * B = "+tu+"/"+mau);
            }else {
          	  System.out.println("A * B = "+tu+"/"+mau);
            }
        }else {
       	 System.out.println("A * B = "+tu);
        }
	    	
	}
//    public void tong2() {
//    	  int tich = b2*a2;
//          int tong = a1*b2+b1*a2;
//          int cost = 0;
//          if(tong < 0){
//              cost = 1;
//              tong = tong*-1;
//          }
//          int uc = ucln(tich,tong);
//          //System.out.println(uc);
//          if(cost==1) tong = -tong/uc;
//          else tong = tong/uc;
//          tich = tich/uc;
//          if(tich != 1) {
//              if(tich<0) {
//            	  tong=tong*(-1);
//            	  tich=tich*(-1);
//            	  System.out.println("A + B = "+tong+"/"+tich);
//              }else {
//            	  System.out.println("A + B = "+tong+"/"+tich);
//              }
//    }else System.out.println("A + B = "+tong);
//	}
    public void thuong() {
		int tu=a1*b2;
		int mau=a2*b1;
		int uc=ucln(tu, mau);
		int cost = 0;
	      if(tu < 0){
	         cost = 1;
	         tu = tu*-1;
	     }
	        //System.out.println(uc);
	    if(cost==1) tu = -tu/uc;
	    else tu = tu/uc;
	    mau = mau/uc;
	    if(mau != 1) {
            if(mau<0) {
            	tu=tu*(-1);
            	mau=mau*(-1);
          	  System.out.println("A / B = "+tu+"/"+mau);
            }else {
          	  System.out.println("A / B = "+tu+"/"+mau);
            }
        }else {
       	 System.out.println("A / B = "+tu);
        }
	    	
	}
    public static void main(String[] args) {
		PhanSo paPhanSo=new PhanSo();
		paPhanSo.nhap();
		paPhanSo.tong();
		paPhanSo.hieu();
		paPhanSo.tich();
		paPhanSo.thuong();
		//paPhanSo.tong2();
	}
}
