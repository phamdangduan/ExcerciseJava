package org.example;

import org.example.Bai3.QuanLySach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc213 = new Scanner(System.in);

        QuanLySach qls213 = new QuanLySach();

        // Nhập danh sách tài liệu
        qls213.nhapDanhSachTL213(sc213);

        // Tìm theo loại tài liệu
        System.out.print("\n\nNhap vao loai tai lieu can tim (Sach/TapChi/Bao): ");
        String loai213 = sc213.nextLine();
        qls213.timLoaiTL213(loai213);

        // Tìm theo mã tài liệu
        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL213 = sc213.nextLine();
        qls213.timMaTL213(maTL213);

        sc213.close();
    }
}
