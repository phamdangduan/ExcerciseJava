package org.example.Bai3;

import java.util.Scanner;

public class TaiLieu {

    private String maTaiLieu213;
    private String tenNXB213;
    private int soBanPhatHanh213;

    // Constructor không đối số
    public TaiLieu() {
    }

    // Constructor có đối số
    public TaiLieu(String maTaiLieu213, String tenNXB213, int soBanPhatHanh213) {
        this.maTaiLieu213 = maTaiLieu213;
        this.tenNXB213 = tenNXB213;
        this.soBanPhatHanh213 = soBanPhatHanh213;
    }

    // Nhập thông tin
    public void nhapThongTin213(Scanner sc213) {
        System.out.print("\tNhap ma tai lieu: ");
        maTaiLieu213 = sc213.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB213 = sc213.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        soBanPhatHanh213 = sc213.nextInt();
        sc213.nextLine(); // Clear buffer
    }

    // Hiển thị thông tin
    public void hienThiThongTin213() {
        System.out.println("\tMa tai lieu: " + maTaiLieu213);
        System.out.println("\tTen nha xuat ban: " + tenNXB213);
        System.out.println("\tSo ban phat hanh: " + soBanPhatHanh213);
    }

    // Getter
    public String getMaTaiLieu213() {
        return maTaiLieu213;
    }

    // (Nếu cần có thêm setter/getter khác, cũng thêm hậu tố 213)
}
