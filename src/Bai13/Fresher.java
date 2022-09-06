package Bai13;

import java.util.List;

public class Fresher extends Employee{
    private String graduation_date;
    private String graduation_rank;
    private String education;
    public Fresher(){

    }
    public Fresher(String id, String fullname, String birthday, String phone,
                   String email, int employee_type, List<Cetificate> cetificates,
                   String graduation_date, String graduation_rank, String education) {
        super(id, fullname, birthday, phone, email, employee_type, cetificates);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduation_date='" + graduation_date + '\'' +
                ", graduation_rank='" + graduation_rank + '\'' +
                ", education='" + education + '\'' +
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
    public void showInfor() {
        System.out.println(this);
    }
}
