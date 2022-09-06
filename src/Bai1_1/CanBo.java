package Bai1_1;

import java.util.Scanner;

public class CanBo {
    // thuoc tinh
    private String name;
    private int age;
    private String gender;
    private String address;

    // phuong thuc
    // ham khoi tao khong doi so
    public CanBo() {

    }

    // ham khoi tao co doi so
    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.println("\tNhap ho ten: ");
        name = sc.nextLine();
        System.out.println("\tNhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        address = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("Ho ten: " + name);
        System.out.println("Ngay sinh: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Dia chi: " + address);
    }

    // ham lay thong tin ho ten
    public String getName() {
        return this.name;
    }
}
