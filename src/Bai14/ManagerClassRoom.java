package Bai14;


import Bai13.*;

import java.util.Scanner;

public class ManagerClassRoom {
    private ClassRoom classRoom = new ClassRoom();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent(int type){
        Student student = null;
        if(type == 1){
            student = addGoodStudent();
        }
        if (type == 2){
            student = addNormalStudent();
        }
        try{
            checkData(student);
        }
        catch (InvalidFullnameException e){
            addStudent(type);
        }
        catch (InvalidPhoneNumberException e){
            addStudent(type);
        }
        catch (InvalidDOBException e){
            addStudent(type);
        }
        this.classRoom.add(student);
    }
    private void checkData(Student student) throws InvalidFullnameException, InvalidPhoneNumberException, InvalidDOBException {
        Invalidator.checkFullname(student.getFullname());
        Invalidator.checkPhone(student.getPhone());
        Invalidator.checkDOB(student.getDob());
    }

    //Ham them Good student
    private Student addGoodStudent(){
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
        System.out.print("Nhap xep gpa: ");
        Double gpa = scanner.nextDouble();scanner.nextLine();
        System.out.println("Nhap loai hoc bong: ");
        String bestRewardName = scanner.nextLine();

        Student goodStudent = new GoodStudent(fullname, doB, sex, phone, universityName, gradeLevel, gpa, bestRewardName);
        return goodStudent;
    }
    private Student addNormalStudent(){
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

        Student normalStudent = new NormalStudent(fullname, doB, sex, phone, universityName, gradeLevel, englishScore, entryTestCore);
        return normalStudent;
    }
    //ham hien thi thong tin
    public void showAllInfor(){
        this.classRoom.showMyInfor();
    }
}
