package org.example.Bai2;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao213;

    // Constructor không tham số
    public KySu() {
        super();
    }

    // Constructor đầy đủ
    public KySu(String hoTen213, String ngaySinh213, String gioiTinh213, String diaChi213, String nganhDaoTao213) {
        super(hoTen213, ngaySinh213, gioiTinh213, diaChi213);
        this.nganhDaoTao213 = nganhDaoTao213;
    }

    // Ghi đè hàm nhập thông tin
    @Override
    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao213 = sc213.nextLine();
    }

    // Ghi đè hàm hiển thị thông tin
    @Override
    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tNganh dao tao: " + nganhDaoTao213);
    }

    // Getter nếu cần
    public String getNganhDaoTao213() {
        return nganhDaoTao213;
    }
}
