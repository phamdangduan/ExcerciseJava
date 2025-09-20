package org.example.Bai2;

import java.util.Scanner;

public class CanBo {
    private String hoTen213;
    private String ngaySinh213;
    private String gioiTinh213;
    private String diaChi213;

    // Constructor có tham số
    public CanBo(String hoTen213, String ngaySinh213, String gioiTinh213, String diaChi213) {
        this.hoTen213 = hoTen213;
        this.ngaySinh213 = ngaySinh213;
        this.gioiTinh213 = gioiTinh213;
        this.diaChi213 = diaChi213;
    }

    // Constructor không tham số
    public CanBo() {
    }

    // Nhập thông tin
    public void nhapThongTin213(Scanner sc213) {
        System.out.print("Moi nhap ho ten: ");
        hoTen213 = sc213.nextLine();
        System.out.print("Moi nhap ngay sinh: ");
        ngaySinh213 = sc213.nextLine();
        System.out.print("Moi nhap gioi tinh: ");
        gioiTinh213 = sc213.nextLine();
        System.out.print("Moi nhap dia chi: ");
        diaChi213 = sc213.nextLine();
    }

    // Hiển thị thông tin
    public void hienThiThongTin213() {
        System.out.println("\tHo ten: " + hoTen213);
        System.out.println("\tNgay sinh: " + ngaySinh213);
        System.out.println("\tGioi tinh: " + gioiTinh213);
        System.out.println("\tDia chi: " + diaChi213);
    }

    // Getter
    public String getHoTen213() {
        return this.hoTen213;
    }

    public String getNgaySinh213() {
        return this.ngaySinh213;
    }

    public String getGioiTinh213() {
        return this.gioiTinh213;
    }

    public String getDiaChi213() {
        return this.diaChi213;
    }
}
