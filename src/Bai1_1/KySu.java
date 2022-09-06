package Bai1_1;

import java.util.Scanner;

public class KySu extends CanBo{
    // thuoc tinh
    private String major;

    // phuong thuc
    // ham khoi tao khong doi so
    public KySu() {

    }

    // ham khoi tao co doi so
    public KySu(String name, int age, String gender, String address, String major) {
        super(name, age, gender, address);
        this.major = major;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao: ");
        major = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + major);
    }
}
