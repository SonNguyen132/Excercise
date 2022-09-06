package Bai11;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoPhuc soPhuc1 = new SoPhuc();
        SoPhuc soPhuc2 = new SoPhuc();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("So phuc");
            System.out.println("1. Nhap so phuc");
            System.out.println("2. Hien thi so phuc");
            System.out.println("3. Cong 2 so phuc");
            System.out.println("4. Nhan 2 so phuc");
            System.out.println("5. Thoat");
            String choice = scanner.nextLine();
            switch (choice){
                case "1": {
                    System.out.println("Nhap so phuc thu nhat thu nhat: ");
                    soPhuc1.nhapSP();
                    System.out.println("Nhap so phuc thu nhat thu hai: ");
                    soPhuc2.nhapSP();
                    break;
                }
                case "2": {
                    System.out.println("So phuc thu nhat la: ");
                    soPhuc1.hienThi(soPhuc1);
                    System.out.println("So phuc thu hai la: ");
                    soPhuc1.hienThi(soPhuc2);
                    break;
                }
                case "3": {
                    SoPhuc tong = new SoPhuc();
                    tong = tong.cong(soPhuc1,soPhuc2);
                    System.out.println("Tong hai so phuc la: ");
                    tong.hienThi(tong);
                    break;
                }
                case "4": {
                    SoPhuc tich = new SoPhuc();
                    tich = tich.tich(soPhuc1, soPhuc2);
                    System.out.println("Tich 2 so phuc la: ");
                    tich.hienThi(tich);
                    break;
                }
                case "5":{
                    System.exit(0);
                    break;
                }
                default:
                    break;
            }
        }
    }
}
