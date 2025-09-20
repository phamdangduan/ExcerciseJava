package org.example;

import org.example.Bai1.PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc213 = new Scanner(System.in);
        PhanSo ps1_213 = new PhanSo();
        PhanSo ps2_213 = new PhanSo();
        PhanSo psTong213 = new PhanSo();

        // Nhập phân số
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_213.nhapPS213(sc213);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_213.nhapPS213(sc213);

        // Tính tổng hai phân số
        psTong213 = ps1_213.congPS213(ps2_213);

        // Hiển thị phân số
        System.out.println("\nPhan so thu nhat la:");
        ps1_213.hienThiPS213();
        System.out.println("\nPhan so thu hai la:");
        ps2_213.hienThiPS213();
        System.out.println("\nPhan so tong la:");
        psTong213.hienThiPS213();

        sc213.close();
    }
}
