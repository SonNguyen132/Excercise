package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("CHuong trinh quan ly thi sinh");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat chuong trinh");

            String choise = scanner.nextLine();
            switch (choise){
                case "1" : {
                    ManagerStudent.addStudent();
                    break;
                }
                case "2" : {
                    ManagerStudent.showInfo();
                    break;
                }
                case "3": {
                    ManagerStudent.findID();
                    break;
                }
                case "4": {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Moi ban nhap lai");
                    break;
            }
        }
    }
}
