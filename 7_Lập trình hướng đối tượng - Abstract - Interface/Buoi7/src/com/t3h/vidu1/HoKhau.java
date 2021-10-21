package com.t3h.vidu1;
import java.util.Scanner;

public class HoKhau {
	
	public String diaChi;

	public String noiLamViec;

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Nhap noi lam viec: ");
		noiLamViec = sc.nextLine();
	}
}
