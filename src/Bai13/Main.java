package Bai13;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BirthDayException {
        ManagerAll managerAll = new ManagerAll();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chuong trinh quan ly");
            System.out.println("1: Them ");
            System.out.println("2: Hien thi ");
            System.out.println("3: Tim kiem ");
            System.out.println("4: Xoa ");
            System.out.println("5: In ra file ");
            System.out.println("6: Doc file ");
            System.out.println("7: Exit");
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
                    managerAll.findID();
                    break;
                }
                case 4:{
                    managerAll.delete();
                    break;
                }
                case 5:{
                    managerAll.inFile();
                    break;
                }
                case 6:{
                    managerAll.readFile();
                    break;
                }
                case 7:{
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
