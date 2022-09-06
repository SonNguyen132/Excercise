package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ManagerStudent {
    private static List<Student> students;

    public ManagerStudent() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public static void addStudent() {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);
            System.out.print("a. Khoi A" + "\t b. Khoi B" + "\t c. Khoi C");
            String enter = scanner.nextLine();
            switch (enter) {
                case "a": {
                    System.out.println("Nhap Ma so bao danh: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhap ten thi sinh: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap dia chi: ");
                    String address = scanner.nextLine();
                    System.out.println("Nhap muc uu tien: ");
                    String priority = scanner.nextLine();
                    System.out.println("Nhap diem toan: ");
                    Double math = scanner.nextDouble();
                    System.out.println("Nhap diem ly: ");
                    Double physic = scanner.nextDouble();
                    System.out.println("Nhap diem hoa: ");
                    Double chemistry = scanner.nextDouble();
                    Student khoiA = new StudentA(id, name, address, priority, math, physic, chemistry);
                    managerStudent.add(khoiA);
                    break;
                }
                case "b": {
                    System.out.println("Nhap Ma so bao danh: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhap ten thi sinh: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap dia chi: ");
                    String address = scanner.nextLine();
                    System.out.println("Nhap muc uu tien: ");
                    String priority = scanner.nextLine();
                    System.out.println("Nhap diem toan: ");
                    Double math = scanner.nextDouble();
                    System.out.println("Nhap diem hoa: ");
                    Double chemistry = scanner.nextDouble();
                    System.out.println("Nhap diem sinh: ");
                    Double biology = scanner.nextDouble();

                    Student khoiB = new StudentB(id, name, address, priority, math, chemistry, biology);
                    managerStudent.add(khoiB);
                    break;
                }
                case "c": {
                    System.out.println("Nhap Ma so bao danh: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhap ten thi sinh: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap dia chi: ");
                    String address = scanner.nextLine();
                    System.out.println("Nhap muc uu tien: ");
                    String priority = scanner.nextLine();
                    System.out.println("Nhap diem van: ");
                    Double literature = scanner.nextDouble();
                    System.out.println("Nhap diem su: ");
                    Double history = scanner.nextDouble();
                    System.out.println("Nhap diem dia: ");
                    Double geography = scanner.nextDouble();

                    Student khoiC = new StudentC(id, name, address, priority, literature, history, geography);
                    managerStudent.add(khoiC);
                    break;
                }
                default:
                    System.out.println("Moi ban nhap lai");
                    break;
            }

    }

    public static void showInfo() {
        students.forEach(student1 -> System.out.println(student1.toString()));
    }

    public static Student findID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap id muon tim: ");
        String id = sc.nextLine();
        return students.stream().filter(s ->s.getId().equals(id)).findFirst().orElse(null);
    }
}
