package org.example.Bai1;

import java.util.Scanner;

public class PhanSo {
    // Thuộc tính
    private int tuSo213;
    private int mauSo213;

    // Hàm khởi tạo không đối số
    public PhanSo() {
        tuSo213 = 0;
        mauSo213 = 1;
    }

    // Hàm khởi tạo có đối số
    public PhanSo(int tuSo213, int mauSo213) {
        this.tuSo213 = tuSo213;
        this.mauSo213 = mauSo213;
    }

    // Hàm nhập phân số
    public void nhapPS213(Scanner sc213) {
        int a213;
        int b213;

        do {
            System.out.print("\tNhap vao tu so: ");
            a213 = sc213.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b213 = sc213.nextInt();

            if (b213 == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                tuSo213 = a213;
                mauSo213 = b213;
            }
        } while (b213 == 0);
    }

    // Hàm hiển thị phân số
    public void hienThiPS213() {
        if (tuSo213 * mauSo213 < 0) {
            System.out.println("\t-" + Math.abs(tuSo213) + "/" + Math.abs(mauSo213));
        } else {
            System.out.println("\t" + Math.abs(tuSo213) + "/" + Math.abs(mauSo213));
        }
    }

    // Hàm cộng phân số
    public PhanSo congPS213(PhanSo ps2_213) {
        int a213 = tuSo213 * ps2_213.mauSo213 + ps2_213.tuSo213 * mauSo213;
        int b213 = mauSo213 * ps2_213.mauSo213;

        return new PhanSo(a213, b213);
    }

    // Hàm trừ phân số
    public PhanSo truPS213(PhanSo ps2_213) {
        int a213 = tuSo213 * ps2_213.mauSo213 - ps2_213.tuSo213 * mauSo213;
        int b213 = mauSo213 * ps2_213.mauSo213;

        return new PhanSo(a213, b213);
    }

    // Hàm nhân phân số
    public PhanSo nhanPS213(PhanSo ps2_213) {
        int a213 = tuSo213 * ps2_213.tuSo213;
        int b213 = mauSo213 * ps2_213.mauSo213;

        return new PhanSo(a213, b213);
    }

    // Hàm chia phân số
    public PhanSo chiaPS213(PhanSo ps2_213) {
        int a213 = tuSo213 * ps2_213.mauSo213;
        int b213 = mauSo213 * ps2_213.tuSo213;

        return new PhanSo(a213, b213);
    }

    // Tìm ước số chung lớn nhất
    private int timUSCLN213(int a213, int b213) {
        int r213 = a213 % b213;

        while (r213 != 0) {
            a213 = b213;
            b213 = r213;
            r213 = a213 % b213;
        }

        return b213;
    }

    // Kiểm tra phân số tối giản
    public boolean kiemTraToiGian213() {
        return timUSCLN213(tuSo213, mauSo213) == 1;
    }

    // Rút gọn phân số
    public void toiGianPS213() {
        int x213 = timUSCLN213(tuSo213, mauSo213);
        tuSo213 /= x213;
        mauSo213 /= x213;
    }
}
