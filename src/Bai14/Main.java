package Bai14;

import Bai13.ManagerAll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerClassRoom managerClassRoom = new ManagerClassRoom();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chuong trinh quan ly");
            System.out.println("1: Them ");
            System.out.println("2: Hien thi ");//Con thieu nhieu
            System.out.println("3: Luu file");
            System.out.println("5: Thoat");
            Integer ch = scanner.nextInt();scanner.nextLine();
            switch (ch) {
                case 1: {
                    System.out.print("1. Goodstudent" + "\t 2. NormalStudent ");
                    int type = scanner.nextInt();scanner.nextLine();
                    managerClassRoom.addStudent(type);
                    break;
                }
                case 2:{
                    managerClassRoom.showAllStudent();
                    break;
                }
                case 3:{
                    managerClassRoom.inFile();
                    break;
                }
                case 5:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
