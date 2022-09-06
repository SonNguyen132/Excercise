package Bai13;

import java.util.List;

public abstract class Employee {
    protected String id;
    protected String fullname;
    protected String birthday;
    protected String phone;
    protected String email;
    protected int employee_type;
    public static long employee_count = 0;
    protected List<Cetificate> cetificates;

    public Employee(String id, String fullname, String birthday, String phone,
                    String email, int employee_type, List<Cetificate> cetificates) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.cetificates = cetificates;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    public List<Cetificate> getCetificates() {
        return cetificates;
    }

    public void setCetificates(List<Cetificate> cetificates) {
        this.cetificates = cetificates;
    }

    //Ham hien thi thong tin
    public abstract void showInfor();
}
