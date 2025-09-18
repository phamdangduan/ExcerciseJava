package org.example;

import org.example.Bai6.KhachSan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql = new KhachSan();

        ql.nhapDanhSach(sc);

        System.out.print("Nhap vao khach tro can tinh tien: ");
        int cmnd = sc.nextInt();

        System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

        sc.close();
    }
}