package org.example;

import org.example.Bai2.QLCB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc213 = new Scanner(System.in);

        QLCB qlcb213 = new QLCB();

        // Nhập danh sách cán bộ
        qlcb213.nhapDanhSach213(sc213);

        // Tìm kiếm theo họ tên
        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name213 = sc213.nextLine();

        qlcb213.timKiemCanBo213(name213);

        // Hủy scanner
        sc213.close();
    }
}
