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
            System.out.println("3: Exit");
            Integer ch = scanner.nextInt();scanner.nextLine();
            switch (ch) {
                case 1: {
                    System.out.print("0. Goodstudent" + "\t 1. NormalStudent ");
                    int type = scanner.nextInt();
                    managerClassRoom.addStudent(type);
                    break;
                }
                case 2:{
                    managerClassRoom.showAllInfor();
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
