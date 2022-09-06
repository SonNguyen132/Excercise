package Bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Quan ly the ");
            System.out.println("1. Them moi the ");
            System.out.println("2. Hien thi thong tin the muon ");
            System.out.println("3. Xoa phieu muon ");
            System.out.println("4. Thoat ");

            String choise = scanner.nextLine();
            switch (choise){
                case "1":{
                    System.out.print("Nhap ten sinh vien: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi sinh vien: ");
                    int age = scanner.nextInt();scanner.nextLine();
                    System.out.print("Nhap lop sinh vien: ");
                    String lop = scanner.nextLine();
                    System.out.print("Nhap ma the muon: ");
                    String idThe = scanner.nextLine();
                    System.out.print("Nhap ngay muon: ");
                    int ngayMuon = scanner.nextInt();
                    System.out.print("Nhap ngay tra: ");
                    int ngayTra = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nhap ma sach muon: ");
                    String idSach = scanner.nextLine();
                    SinhVien sinhVien = new SinhVien(name, age, lop);
                    TheMuon theMuon = new TheMuon(sinhVien, idThe, ngayMuon, ngayTra, idSach);
                    quanLyTheMuon.add(theMuon);
                    break;
                }
                case "2":{
                    quanLyTheMuon.hienThiTheMuon();
                    break;
                }
                case "3":{
                    System.out.println("Nhap id muon xoa: ");
                    String id = scanner.nextLine();
                    quanLyTheMuon.xoaTheoIDThe(id);
                    break;
                }
                case "4":{
                    break;
                }
                default:
                    break;
            }
        }
    }
}
