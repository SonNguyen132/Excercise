package Bai1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    // thuoc tinh
    private ArrayList<CanBo> canBo;

    // phuong thuc
    // ham khoi tao
    public QLCB() {
        canBo = new ArrayList<CanBo>(10);
    }

    // ham them can bo
    public void themCanBo(CanBo cb) {
        canBo.add(cb);
    }

    // ham nhap danh sach
    public void nhapDanhSach(Scanner sc) {
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap can bo thu " + (i + 1) + ":");
            System.out.print("a. Ky Su ");
            System.out.print("b. Cong Nhan ");
            System.out.print("c. Nhan Vien \n");
            String chon = sc.nextLine();

            cb = new CanBo();

            switch (chon) {
                case "a":
                    cb = new KySu();
                    break;
                case "b":
                    cb = new NhanVien();
                    break;
                case "c":
                    cb = new CongNhan();
                    break;

                default:
                    cb = new KySu();
                    break;
            }

            // sau khi chon loai can bo thi nhap thong tin cho can bo do
            cb.nhapThongTin(sc);

            // nhap xong roi thi them can bo vao danh sach
            themCanBo(cb);
        }
    }

    // ham tim kiem theo ten
    public void timKiemCanBo(String hoTen) {
        for (CanBo cb : canBo) {
            if (hoTen.equals(cb.getName())) {
                cb.hienThiThongTin();
            }
        }
        System.out.println("Ten ban tim kiem khong co trong danh sach");
    }

    //Hien thi danh sach can bo
    public  void hienThiCanBo(){
        for (CanBo cb : canBo) {
                cb.hienThiThongTin();
            System.out.println("--------------------");
        }
    }
}
