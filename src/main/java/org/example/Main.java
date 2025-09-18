package org.example;

import org.example.Bai4.TuyenSinh;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsTuyenSinh = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh.nhapDanhSach(sc);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();

        dsTuyenSinh.timKiemThiSinh(soBaoDanh);

        sc.close();
    }
}