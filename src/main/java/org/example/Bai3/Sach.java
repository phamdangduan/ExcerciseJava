package org.example.Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu {
    // Thuộc tính
    private String tacGia213;
    private int soTrang213;

    // Constructor không đối số
    public Sach() {
    }

    // Constructor có đối số
    public Sach(String maTaiLieu213, String tenNXB213, int soBanPhatHanh213, String tacGia213, int soTrang213) {
        super(maTaiLieu213, tenNXB213, soBanPhatHanh213);
        this.tacGia213 = tacGia213;
        this.soTrang213 = soTrang213;
    }

    // Hàm nhập thông tin
    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap tac gia: ");
        tacGia213 = sc213.nextLine();
        System.out.print("\tNhap so trang: ");
        soTrang213 = sc213.nextInt();
        sc213.nextLine(); // Clear buffer
    }

    // Hàm hiển thị thông tin
    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tTac gia: " + tacGia213);
        System.out.println("\tSo trang: " + soTrang213);
    }

    // Getters nếu cần
    public String getTacGia213() {
        return tacGia213;
    }

    public int getSoTrang213() {
        return soTrang213;
    }
}
