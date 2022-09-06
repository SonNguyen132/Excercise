package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();
        while (true) {
            System.out.println("Quan ly khach san");
            System.out.println("1: Them nguoi");
            System.out.println("2: Xoa nguoi theo cmnd");
            System.out.println("3: Tinh tien");
            System.out.println("4: Hien thi thong tin");
            System.out.println("5: Thoat");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhap cmnd: ");
                    scanner.nextLine();
                    String cmnd = scanner.nextLine();
                    System.out.println("Moi chon loai phong");
                    System.out.println("a. Chon phong loai A");
                    System.out.println("b. Chon phong loai B");
                    System.out.println("c. Chon phong loai C");
                    String choise = scanner.nextLine();
                    Phong phong;
                    switch (choise){
                        case "a": {
                            phong = new PhongA();
                            break;
                        }
                        case "b": {
                            phong = new PhongB();
                            break;
                        }
                        case "c": {
                            phong = new PhongC();
                            break;
                        }
                        default: continue;
                    }
                    System.out.print("Nhap so nguoi thue: ");
                    int soNguoi = scanner.nextInt();
                    Nguoi nguoi = new Nguoi(name, age, cmnd, phong, soNguoi);
                    khachSan.add(nguoi);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Nhap so cmnd can xoa: ");
                    String cmnd = scanner.nextLine();
                    khachSan.delete(cmnd);
                    break;
                }
                case "3": {
                    System.out.print("Nhap so cmnd de tinh tien phong: ");
                    String cmnd = scanner.nextLine();
//                    int gia = khachSan.tinhTien(cmnd);
                    System.out.println("Gia: " + khachSan.tinhTien(cmnd));
                    break;
                }
                case "4": {
                    khachSan.hienThi();
                    break;
                }
                case "5": {
                    System.out.println("Goodbye");
                    return;
                }
                default:
                    System.out.println("Moi ban nhap lai");

            }
        }

    }
}
