package org.example.Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh213;

    // Constructor không đối số
    public Bao() {
    }

    // Constructor có đối số
    public Bao(String maTaiLieu213, String tenNXB213, int soBanPhatHanh213, String ngayPhatHanh213) {
        super(maTaiLieu213, tenNXB213, soBanPhatHanh213);
        this.ngayPhatHanh213 = ngayPhatHanh213;
    }

    // Hàm nhập thông tin
    public void nhapThongTin213(Scanner sc213) {
        super.nhapThongTin213(sc213);
        System.out.print("\tNhap ngay phat hanh: ");
        ngayPhatHanh213 = sc213.nextLine();
    }

    // Hàm hiển thị thông tin
    public void hienThiThongTin213() {
        super.hienThiThongTin213();
        System.out.println("\tNgay phat hanh: " + ngayPhatHanh213);
    }

    // Getter nếu cần
    public String getNgayPhatHanh213() {
        return ngayPhatHanh213;
    }
}
