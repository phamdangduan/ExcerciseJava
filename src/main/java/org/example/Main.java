package org.example;

import org.example.Bai5.KhuPho;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhuPho qlkp = new KhuPho();

        qlkp.nhapDanhSach(sc);

        System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
        qlkp.timKiemThongTin();
    }
}