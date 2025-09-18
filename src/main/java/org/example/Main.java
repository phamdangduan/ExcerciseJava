package org.example;
import org.example.Bai2.QLCB;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb = new QLCB();

        qlcb.nhapDanhSach(sc);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();

        qlcb.timKiemCanBo(name);

        // huy sc
        sc.close();
    }
}