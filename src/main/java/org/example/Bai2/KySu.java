package org.example.Bai2;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nghanhDaoTao;

    // Constructor không tham số (bắt buộc phải có nếu tạo new KySu() mà không truyền gì)
    public KySu() {
        super(); // Gọi constructor không tham số của CanBo
    }

    // Constructor đầy đủ (nếu muốn tạo nhanh 1 đối tượng có đủ dữ liệu)
    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nghanhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nghanhDaoTao = nghanhDaoTao;
    }

    // Ghi đè hàm nhập thông tin
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nghanhDaoTao = sc.nextLine();
    }

    // Ghi đè hàm hiển thị thông tin
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nghanhDaoTao);
    }
}
