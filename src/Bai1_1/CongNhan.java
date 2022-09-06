package Bai1_1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    // thuoc tinh
    private String level;

    // phuong thuc
    // ham khoi tao khong doi so
    public CongNhan() {
        super();

    }

    // ham khoi tao co doi so
    public CongNhan(String name, int age, String gender, String address, String level) {
        super(name, age, gender, address);
        this.level = level;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap level: ");
        level = sc.nextLine();
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("level: " + level);
    }
}
