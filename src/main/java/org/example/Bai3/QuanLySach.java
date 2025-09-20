package org.example.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl213;

    // Hàm khởi tạo
    public QuanLySach() {
        dstl213 = new ArrayList<TaiLieu>(10);
    }

    // Thêm mới 1 tài liệu
    public void themTaiLieu213(TaiLieu tl213) {
        dstl213.add(tl213);
    }

    // Nhập danh sách tài liệu
    public void nhapDanhSachTL213(Scanner sc213) {
        int chon213;
        String stop213;
        TaiLieu tl213;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon213 = sc213.nextInt();
            sc213.nextLine();

            switch (chon213) {
                case 1:
                    tl213 = new Sach();
                    break;
                case 2:
                    tl213 = new TapChi();
                    break;
                case 3:
                    tl213 = new Bao();
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Mac dinh chon Sach.");
                    tl213 = new Sach();
                    break;
            }

            // Gọi hàm nhập đúng phiên bản
            if (tl213 instanceof Sach) {
                ((Sach) tl213).nhapThongTin213(sc213);
            } else if (tl213 instanceof TapChi) {
                ((TapChi) tl213).nhapThongTin213(sc213);
            } else if (tl213 instanceof Bao) {
                ((Bao) tl213).nhapThongTin213(sc213);
            }

            themTaiLieu213(tl213);

            System.out.print("\nBan co muon nhap tiep nua khong (c/k): ");
            stop213 = sc213.nextLine();
        } while (stop213.equals("c"));
    }

    // Tìm kiếm theo mã tài liệu
    public void timMaTL213(String maTL213) {
        for (TaiLieu tl213 : dstl213) {
            if (maTL213.equals(tl213.getMaTaiLieu213())) {
                if (tl213 instanceof Sach) {
                    ((Sach) tl213).hienThiThongTin213();
                } else if (tl213 instanceof TapChi) {
                    ((TapChi) tl213).hienThiThongTin213();
                } else if (tl213 instanceof Bao) {
                    ((Bao) tl213).hienThiThongTin213();
                }
            }
        }
    }

    // Tìm kiếm theo loại tài liệu
    public void timLoaiTL213(String loai213) {
        for (TaiLieu tl213 : dstl213) {
            if (loai213.equals("Sach") && tl213 instanceof Sach) {
                ((Sach) tl213).hienThiThongTin213();
            } else if (loai213.equals("TapChi") && tl213 instanceof TapChi) {
                ((TapChi) tl213).hienThiThongTin213();
            } else if (loai213.equals("Bao") && tl213 instanceof Bao) {
                ((Bao) tl213).hienThiThongTin213();
            }
        }
    }
}
