package Bai1_1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    // thuoc tinh
    private String work;

    // phuong thuc
    // ham khoi tao khong doi so
    public NhanVien() {

    }

    // ham khoi tao co doi so
    public NhanVien(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        work = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + work);
    }
}
