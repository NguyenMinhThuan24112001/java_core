package com.t3h.vidu3;

import java.util.Scanner;

public class NhanKhau {

	public String ten;

	public String ngaySinh;

	public String gioiTinh;

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioiTinh = sc.nextLine();
	}
	
}
