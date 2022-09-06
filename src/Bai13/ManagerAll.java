package Bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAll {
    private EmployeeManagerment employeeManagerment = new EmployeeManagerment();
    private Scanner scanner = new Scanner(System.in);
    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void them(int type){
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
        try {
            checkData(employee);
        }catch (BirthDayException e) {
            them(type);
        } catch (PhoneException e) {
            them(type);
        } catch (EmaiException e) {
            them(type);
        } catch (FullNameException e) {
            them(type);
        }
        this.employeeManagerment.add(employee);
    }
    //Ham check data cua employee
    private void checkData(Employee employee) throws BirthDayException, PhoneException, EmaiException, FullNameException {
        Validator.checkBirthDay(employee.getBirthday());
        Validator.checkPhone(employee.getPhone());
        Validator.checkEmail(employee.getEmail());
        Validator.checkFullname(employee.getFullname());
    }
    //Ham nhap cetificate
    private Cetificate addCerificate(){
        System.out.print("Nhap ID bang: ");
        int certificateID = scanner.nextInt();scanner.nextLine();
        System.out.println("Nhap ten bang: ");
        String certificateName = scanner.nextLine();
        System.out.println("Nhap loai bang: ");
        String certificateRank = scanner.nextLine();
        System.out.println("Nhap ngay cao bang: ");
        String getCertificateDate = scanner.nextLine();
        Cetificate cetificate = new Cetificate(certificateID, certificateName, certificateRank, getCertificateDate);
        return cetificate;
    }

    //Ham in certificate
    private List<Cetificate> showCertificate(Cetificate cetificate){
        return showCertificate(cetificate);
    }
    //Ham them Experiece
    private Experience themExperience(){
        Experience experience = new Experience();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.print("Nhap so nam kinh nghiem: ");
        int exInYear = scanner.nextInt(); scanner.nextLine();
        System.out.println("Nhap skill: ");
        String proSkill = scanner.nextLine();
        experience = new Experience(id, fullname,birthday, phone, email, 0, showCertificate(addCerificate()), exInYear, proSkill);
        return experience;
    }
    //Ham them Fresher
    private Fresher themFresher(){
        Fresher fresher = new Fresher();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.print("Nhap ngay ra tot ngiep: ");
        String graduation_date = scanner.nextLine();
        System.out.println("Nhap xep laoi tot nghiep: ");
        String graduation_rank = scanner.nextLine();
        System.out.println("Nhap truong tot nghiep: ");
        String education = scanner.nextLine();
        fresher = new Fresher(id, fullname,birthday, phone, email, 1, showCertificate(addCerificate()), graduation_date, graduation_rank, education);
        return fresher;
    }
    //Ham them Intern
    private Intern themIntern(){
        Intern intern = new Intern();
        System.out.print("Nhap ID:");
        String id = scanner.nextLine();
        System.out.println("Nhap fullname: ");
        String fullname = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        String birthday = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.print("Nhap chuyen nganh hoc: ");
        String majors = scanner.nextLine();
        System.out.println("Nhap hoc ky dang hoc: ");
        String semester = scanner.nextLine();
        System.out.println("Nhap truong dang hoc: ");
        String university_name = scanner.nextLine();
        intern = new Intern(id, fullname,birthday, phone, email, 2, showCertificate(addCerificate()), majors, semester, university_name);
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
}
