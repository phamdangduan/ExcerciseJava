package org.example.Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac213;

    public CongNhan(String hoTen213, String ngaySinh213, String gioiTinh213, String diaChi213, String bac213) {
        super(hoTen213, ngaySinh213, gioiTinh213, diaChi213);
        this.bac213 = bac213;
    }

    public CongNhan() {
        super();
    }

    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap bac: ");
        bac213 = sc213.nextLine();
    }

    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tBac: " + bac213);
    }

    // Getter nếu cần
    public String getBac213() {
        return bac213;
    }
}
