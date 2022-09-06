package Bai12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPTGT quanLyPTGT = new QuanLyPTGT();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Quan ly phuong tien giao thong");
            System.out.println("1. Them moi phuong tien giao thong");
            System.out.println("2. Hien thi phuong tien giao thong");
            System.out.println("3. Xoa phuong tien gaio thong");
            System.out.println("4. Tim phuong tien giao thong");
            System.out.println("5. Thoat");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":{
                    System.out.println("Chon laoi phuong tien can nhap");
                    System.out.print("a. Oto" + "\t b. Xe may" + "\t c. Xe tai");
                    String choose = scanner.nextLine();
                    switch (choose){
                        case "a":{
                            System.out.print("Nhap ID phuong tien: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap hang san xuat: ");
                            String hangSX = scanner.nextLine();
                            System.out.print("Nhap nam san xuat: ");
                            int year = scanner.nextInt();
                            System.out.print("Nhap gia phuong tien: ");
                            double gia  = scanner.nextDouble();scanner.nextLine();
                            System.out.print("Nhap mau phuong tien: ");
                            String mau = scanner.nextLine();
                            System.out.print("Nhap so cho ngoi: ");
                            int soChoNgoi = scanner.nextInt();scanner.nextLine();
                            System.out.print("Nhap loai dong co: ");
                            String dongCo = scanner.nextLine();
                            PTGT ptgt = new Oto(id, hangSX, year, gia, mau, soChoNgoi, dongCo);
                            quanLyPTGT.add(ptgt);
                            break;
                        }
                        case "b":{
                            System.out.print("Nhap ID phuong tien: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap hang san xuat: ");
                            String hangSX = scanner.nextLine();
                            System.out.print("Nhap nam san xuat: ");
                            int year = scanner.nextInt();
                            System.out.print("Nhap gia phuong tien: ");
                            double gia  = scanner.nextDouble();scanner.nextLine();
                            System.out.print("Nhap mau phuong tien: ");
                            String mau = scanner.nextLine();
                            System.out.print("Nhap Cong suat: ");
                            String congSuat = scanner.nextLine();
                            PTGT ptgt = new XeMay(id, hangSX, year, gia, mau, congSuat);
                            quanLyPTGT.add(ptgt);
                            break;
                        }
                        case "c":{
                            System.out.print("Nhap ID phuong tien: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap hang san xuat: ");
                            String hangSX = scanner.nextLine();
                            System.out.print("Nhap nam san xuat: ");
                            int year = scanner.nextInt();
                            System.out.print("Nhap gia phuong tien: ");
                            double gia  = scanner.nextDouble();scanner.nextLine();
                            System.out.print("Nhap mau phuong tien: ");
                            String mau = scanner.nextLine();
                            System.out.print("Nhap Trong tai: ");
                            String trongTai = scanner.nextLine();
                            PTGT ptgt = new XeTai(id, hangSX, year, gia, mau, trongTai);
                            quanLyPTGT.add(ptgt);
                            break;
                        }
                        default:
                            continue;
                    }

                    break;
                }
                case "2":{
                    System.out.println("Danh sach cac phuong tien giao thong la:");
                    quanLyPTGT.hienThi();
                    break;
                }case "3":{
                    System.out.println("Nhap ID muon xoa:");
                    String id = scanner.nextLine();
                    quanLyPTGT .deleteByID(id);
                    System.out.println("Da xoa thanh cong");
                    break;
                }
                case "4":{
                    System.out.println("Ba muon tim theo:");
                    System.out.print("a. Hang san xuat" + "\t b. Mau xe");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a":{
                            System.out.println("Moi b nhap hang san xuat: ");
                            String hangSX = scanner.nextLine();
                            quanLyPTGT.timTheoHangSX(hangSX);
                            break;
                        }
                        case "b":{
                            System.out.println("Moi b nhap mau xe: ");
                            String mau = scanner.nextLine();
                            quanLyPTGT.timKiemTheoMau(mau);
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            continue;
                    }
                    break;
                }
                case "5":{
                    System.out.println(" Cam on da su dung ct");
                    System.exit(0);
                    break;
                }
                default:
                    continue;

            }
        }
    }
}
