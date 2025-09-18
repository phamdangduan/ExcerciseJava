package org.example.Bai2;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    // Constructor có tham số
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // Constructor không tham số
    public CanBo() {
    }

    // Nhập thông tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("Moi nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Moi nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Moi nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Moi nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + ngaySinh);
        System.out.println("\tGioi tinh: " + gioiTinh);
        System.out.println("\tDia chi: " + diaChi);
    }

    // Getter
    public String getHoTen() {
        return this.hoTen;
    }

    // Các getter khác nếu cần
    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }
}
