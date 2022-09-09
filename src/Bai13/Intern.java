package Bai13;

import java.util.List;

public class Intern extends Employee{
    private String majors;
    private String semester;
    private String univerity_name;
    public Intern(){

    }
    public Intern(String id, String fullname, String birthday, String phone, String email,
                  int employee_type, List<Cetificate> cetificates,
                  String majors, String semester, String univerity_name) {
        super(id, fullname, birthday, phone, email, employee_type, cetificates);
        employee_count ++;
        this.majors = majors;
        this.semester = semester;
        this.univerity_name = univerity_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniverity_name() {
        return univerity_name;
    }

    public void setUniverity_name(String univerity_name) {
        this.univerity_name = univerity_name;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", univerity_name='" + univerity_name + '\'' +
                ", id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type=" + employee_type +
                ", cetificates=" + cetificates +
                "} " + super.toString();
    }

    @Override
    public void showInfor(){
        System.out.println(this);
    }
}
