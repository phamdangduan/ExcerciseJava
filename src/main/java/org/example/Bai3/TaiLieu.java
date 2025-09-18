package org.example.Bai3;

import java.util.Scanner;

public class TaiLieu {

    private String maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;


    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }


    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ma tai lieu: ");
        maTaiLieu = sc.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB = sc.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        soBanPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMa tai lieu: " + maTaiLieu);
        System.out.println("\tTen nha xuat ban: " + tenNXB);
        System.out.println("\tSo ban phat hanh: " + soBanPhatHanh);
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

}