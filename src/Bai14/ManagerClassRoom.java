package Bai14;


import Bai13.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ManagerClassRoom {
    private ClassRoom classRoom = new ClassRoom();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent(int type) {
        Student student = null;
        if(type == 1){
            student = addGoodStudent();
        }
        if (type == 2){
            student = addNormalStudent();
        }
        this.classRoom.add(student);
    }

    //Ham them Good student
    private GoodStudent addGoodStudent() {
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        try {
            Invalidator.checkFullname(fullname);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        try {
            Invalidator.checkPhone(phone);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap date of birth: ");
        String doB = scanner.nextLine();
        try {
            Invalidator.checkDOB(doB);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap ten truong: ");
        String universityName = scanner.nextLine();
        System.out.println("Nhap xep laoi tot nghiep: ");
        String gradeLevel = scanner.nextLine();
        System.out.print("Nhap xep gpa: ");
        Double gpa = scanner.nextDouble();scanner.nextLine();
        System.out.println("Nhap loai hoc bong: ");
        String bestRewardName = scanner.nextLine();

        GoodStudent goodStudent = new GoodStudent(fullname, doB, sex, phone, universityName, gradeLevel, gpa, bestRewardName);
        return goodStudent;
    }
    private NormalStudent addNormalStudent(){
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap date of birth: ");
        String doB = scanner.nextLine();
        System.out.println("Nhap ten truong: ");
        String universityName = scanner.nextLine();
        System.out.println("Nhap xep laoi tot nghiep: ");
        String gradeLevel = scanner.nextLine();
        System.out.print("Nhap diem toeic: ");
        Integer englishScore = scanner.nextInt();scanner.nextLine();
        System.out.print("Nhap diem thi dau vao: ");
        Double entryTestCore = scanner.nextDouble();scanner.nextLine();

        NormalStudent normalStudent = new NormalStudent(fullname, doB, sex, phone, universityName, gradeLevel, englishScore, entryTestCore);
        return normalStudent;
    }
    //ham hien thi thong tin
    public void showAllStudent() {
        this.classRoom.show().forEach(Student::showMyInfor);
    }

    //Ham in file
    public void inFile(){
        try {
            FileWriter fileWriter = new FileWriter("D:\\output.txt");
            String file = "";
            for(Student student : classRoom.getStudents()) {
                file += student + "\n";
            }
            fileWriter.write(file);
            fileWriter.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public void readFile(){
        try {
            FileReader fileReader = new FileReader("D:\\output.txt");
            int file ;
            while ((file = fileReader.read()) != -1) {
                System.out.print((char) file);
            }
            fileReader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
