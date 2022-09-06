package Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCBGV quanLyCBGV = new QuanLyCBGV();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Quan ly giao vien");
            System.out.println("1. Them moi giao vien");
            System.out.println("2. Xoa giao vien theo id");
            System.out.println("3. Tinh luong giao vien");
            System.out.println("4. Thoat");
            String choise = scanner.nextLine();
            switch (choise){
                case "1": {
                    System.out.println("Nhap ten giao vien: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi giao vien: ");
                    int age = scanner.nextInt();scanner.nextLine();
                    System.out.println("Nhap que quan: ");
                    String hometown = scanner.nextLine();
                    System.out.println("Nhap id: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap luong cung: ");
                    double luongCung = scanner.nextDouble();
                    System.out.print("Nhap luong thuong: ");
                    double luongThuong = scanner.nextDouble();
                    System.out.print("Nhap luong phat: ");
                    double luongPhat = scanner.nextDouble();scanner.nextLine();
                    Nguoi nguoi = new Nguoi(name, age, hometown, id);
                    CBGV cbgv = new CBGV(luongCung, luongThuong, luongPhat, nguoi);
                    quanLyCBGV.add(cbgv);
                    break;
                }
                case "2": {
                    System.out.println("Nhap id muon xoa: ");
                    String id = scanner.nextLine();
                    quanLyCBGV.xoaID(id);
                    break;
                }
                case "3": {
                    System.out.println("Nhap id: ");
                    String id = scanner.nextLine();
                    double luong = quanLyCBGV.tinhLuong(id);
                    System.out.println(luong);
                    break;
                }
                case "4": {
                    System.out.println("Khong hop le");
                    break;
                }
            }
        }
    }
}
