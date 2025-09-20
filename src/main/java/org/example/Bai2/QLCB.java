package org.example.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    // Thuộc tính
    private ArrayList<CanBo> dscb213;

    // Hàm khởi tạo
    public QLCB() {
        dscb213 = new ArrayList<CanBo>(10);
    }

    // Hàm thêm cán bộ
    public void themCanBo213(CanBo cb213) {
        dscb213.add(cb213);
    }

    // Hàm nhập danh sách
    public void nhapDanhSach213(Scanner sc213) {
        CanBo cb213;
        System.out.print("Nhap vao so luong can bo: ");
        int n213 = sc213.nextInt();
        sc213.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i213 = 0; i213 < n213; i213++) {
            System.out.println("Lan nhap thu " + (i213 + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
            int chon213 = sc213.nextInt();
            sc213.nextLine();

            cb213 = new CanBo(); // Khởi tạo tạm thời

            switch (chon213) {
                case 1:
                    cb213 = new KySu();
                    break;
                case 2:
                    cb213 = new NhanVien();
                    break;
                case 3:
                    cb213 = new CongNhan();
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Mac dinh la KySu.");
                    cb213 = new KySu();
                    break;
            }

            // Nhập thông tin tương ứng
            if (cb213 instanceof KySu) {
                ((KySu) cb213).nhapThongTin213(sc213);
            } else if (cb213 instanceof NhanVien) {
                ((NhanVien) cb213).nhapThongTin213(sc213);
            } else if (cb213 instanceof CongNhan) {
                ((CongNhan) cb213).nhapThongTin213(sc213);
            }

            // Thêm cán bộ vào danh sách
            themCanBo213(cb213);
        }
    }

    // Hàm tìm kiếm theo tên
    public void timKiemCanBo213(String hoTen213) {
        for (CanBo cb213 : dscb213) {
            if (hoTen213.equals(cb213.getHoTen213())) {
                if (cb213 instanceof KySu) {
                    ((KySu) cb213).hienThiThongTin213();
                } else if (cb213 instanceof NhanVien) {
                    ((NhanVien) cb213).hienThiThongTin213();
                } else if (cb213 instanceof CongNhan) {
                    ((CongNhan) cb213).hienThiThongTin213();
                }
            }
        }
    }
}
