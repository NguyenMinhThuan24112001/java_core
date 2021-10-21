package com.t3h.vidu2;

import java.util.Scanner;

public class ThanhVien implements NhanKhau, HoKhau, Khau3 {

	public static final String TEN_CLASS = "ThanhVien";
	
	public static final int BienInterger = 20;

	
	public String ten;

	public String ngaySinh;

	public String gioiTinh;

	public String diaChi;

	public String noiLamViec;

	@Override
	public void nhapThongTin() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Nhap noi lam viec: ");
		noiLamViec = sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		System.out.println(HoKhau.THANH_PHO);
		
		System.out.println(TEN_CLASS);
		
		
		
	}

}
