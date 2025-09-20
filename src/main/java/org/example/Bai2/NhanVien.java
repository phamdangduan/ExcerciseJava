package org.example.Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec213;

    public NhanVien(String hoTen213, String ngaySinh213, String gioiTinh213, String diaChi213, String congViec213) {
        super(hoTen213, ngaySinh213, gioiTinh213, diaChi213);
        this.congViec213 = congViec213;
    }

    public NhanVien() {
        super();
    }

    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap cong viec: ");
        congViec213 = sc213.nextLine();
    }

    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tCong viec: " + congViec213);
    }

    // Getter nếu cần
    public String getCongViec213() {
        return congViec213;
    }
}
