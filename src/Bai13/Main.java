package Bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerAll managerAll = new ManagerAll();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chuong trinh quan ly");
            System.out.println("1: Them ");
            System.out.println("2: Hien thi ");
            System.out.println("3: Tim kiem ");
            System.out.println("4: Xoa ");
            System.out.println("5: Exit");
            Integer ch = scanner.nextInt();scanner.nextLine();
            switch (ch) {
                case 1: {
                    System.out.print("0. Experience" + "\t 1. Fresher " + "\t 2. Intern");
                    // input 0 => insert Experience
                    // input 1 => insert Fresher
                    // input 2 => insert Intern
                    int type = scanner.nextInt();
                    managerAll.them(type);
                    break;
                }
                case 2:{
                    managerAll.showAllEmployee();
                    break;
                }
                case 3:{

                    break;
                }
                case 4:{
                    managerAll.delete();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}