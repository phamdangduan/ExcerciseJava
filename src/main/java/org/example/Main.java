package org.example;

import org.example.Bai10.QuanLy;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql = new QuanLy();
        ql.nhapDanhSach(sc);

        System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
        ql.hienThiDanhSach();

        sc.close();
    }
}