package Bai13;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.CharBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAll {
    private EmployeeManagerment employeeManagerment = new EmployeeManagerment();
    private static Scanner scanner = new Scanner(System.in);
    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void them(int type) throws BirthDayException {
        Employee employee = null;
        if (type == 0 ){
            employee = themExperience();
        }
        if (type == 1 ){
            employee = themFresher();
        }
        if (type == 2){
            employee = themIntern();
        }
        this.employeeManagerment.add(employee);
    }

    //Ham nhap cetificate
    private static List<Cetificate> addCerificate() {
        List<Cetificate> listCetificates = new ArrayList<>();
        System.out.println("Nhap danh sach Certificate: ");
        int n = scanner.nextInt(); scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap Certificate thu " + (i + 1));
            System.out.print("Nhap ID bang: ");
            int certificateID = scanner.nextInt();scanner.nextLine();
            System.out.println("Nhap ten bang: ");
            String certificateName = scanner.nextLine();
            System.out.println("Nhap loai bang: ");
            String certificateRank = scanner.nextLine();
            System.out.println("Nhap ngay cao bang: ");
            String getCertificateDate = scanner.nextLine();
            try {
                Validator.checkBirthDay(getCertificateDate);
            }catch (Exception e){
                System.out.println(e);
            }
            listCetificates.add(new Cetificate(certificateID, certificateName, certificateRank, getCertificateDate));
        }
        return listCetificates;
    }

    //Ham them Experiece
    private Experience themExperience() {
        Experience experience = new Experience();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        try {
            Validator.checkFullname(fullname);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        try {
            Validator.checkBirthDay(birthday);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        try {
            Validator.checkPhone(phone);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        try {
            Validator.checkEmail(email);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("Nhap so nam kinh nghiem: ");
        int exInYear = scanner.nextInt(); scanner.nextLine();
        System.out.println("Nhap skill: ");
        String proSkill = scanner.nextLine();
        List<Cetificate> cetificates = addCerificate();
        experience = new Experience(id, fullname,birthday, phone, email, 0,cetificates, exInYear, proSkill);
        return experience;
    }
    //Ham them Fresher
    private Fresher themFresher() {
        Fresher fresher = new Fresher();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        try {
            Validator.checkFullname(fullname);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        try {
            Validator.checkBirthDay(birthday);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        try {
            Validator.checkPhone(phone);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        try {
            Validator.checkEmail(email);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("Nhap ngay ra tot ngiep: ");
        String graduation_date = scanner.nextLine();
        System.out.println("Nhap xep laoi tot nghiep: ");
        String graduation_rank = scanner.nextLine();
        System.out.println("Nhap truong tot nghiep: ");
        String education = scanner.nextLine();
        List<Cetificate> cetificates = addCerificate();
        fresher = new Fresher(id, fullname,birthday, phone, email, 1, cetificates, graduation_date, graduation_rank, education);
        return fresher;
    }
    //Ham them Intern
    private Intern themIntern() {
        Intern intern = new Intern();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        try {
            Validator.checkFullname(fullname);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        try {
            Validator.checkBirthDay(birthday);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        try {
            Validator.checkPhone(phone);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        try {
            Validator.checkEmail(email);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("Nhap chuyen nganh hoc: ");
        String majors = scanner.nextLine();
        System.out.println("Nhap hoc ky dang hoc: ");
        String semester = scanner.nextLine();
        System.out.println("Nhap truong dang hoc: ");
        String university_name = scanner.nextLine();
        List<Cetificate> certificates = addCerificate();
        intern = new Intern(id, fullname,birthday, phone, email, 2, certificates, majors, semester, university_name);
        return intern;
    }
    //ham hien hthi
    public void showAllEmployee() {
        this.employeeManagerment.findAll().forEach(Employee::showInfor);
    }
    //Ham xoa
    public void delete() {
        System.out.print("Nhap ID de xoa: ");
        String id = scanner.nextLine();
        this.employeeManagerment.deleteByID(id);
    }
    public void findID(){
        System.out.println("Ban muon tim kiem: ");
        System.out.println("0.Experience" + "1. Fresher" + "2. Intern");
        int type = scanner.nextInt();
        employeeManagerment.findEmployee(type);
    }
    //Inrafile
    public void inFile(){
        try {
            FileWriter fileWriter = new FileWriter("D:\\output.txt");
            String file = "";
            for(Employee employee : employeeManagerment.getEmployees()) {
                file += employee + "\n";
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
