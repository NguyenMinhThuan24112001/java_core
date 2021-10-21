package com.t3h.vidu3;

import java.util.Scanner;

public class ThanhVien extends NhanKhau implements HoKhau, Khau3 {

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

}
