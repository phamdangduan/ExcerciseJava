package org.example.Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    // Thuộc tính
    private int soPhatHanh213;
    private int thangPhatHanh213;

    // Constructor không đối số
    public TapChi() {
    }

    // Constructor có đối số
    public TapChi(String maTaiLieu213, String tenNXB213, int soBanPhatHanh213, int soPhatHanh213, int thangPhatHanh213) {
        super(maTaiLieu213, tenNXB213, soBanPhatHanh213);
        this.soPhatHanh213 = soPhatHanh213;
        this.thangPhatHanh213 = thangPhatHanh213;
    }

    // Hàm nhập thông tin
    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh213 = sc213.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        thangPhatHanh213 = sc213.nextInt();
        sc213.nextLine(); // Clear buffer
    }

    // Hàm hiển thị thông tin
    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tSo phat hanh: " + soPhatHanh213);
        System.out.println("\tThang phat hanh: " + thangPhatHanh213);
    }

    // Getters nếu cần
    public int getSoPhatHanh213() {
        return soPhatHanh213;
    }

    public int getThangPhatHanh213() {
        return thangPhatHanh213;
    }
}
