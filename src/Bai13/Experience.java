package Bai13;

import java.util.List;

public class Experience extends Employee{
    private int exInYear;
    private String proSkill;

    public Experience(String id, String fullname, String birthday, String phone, String email, int employee_type, List<Cetificate> cetificates, int exInYear, String proSkill) {
        super(id, fullname, birthday, phone, email, employee_type, cetificates);
        this.exInYear = exInYear;
        this.proSkill = proSkill;
    }

    public Experience() {
        super();
    }

    public int getExInYear() {
        return exInYear;
    }

    public void setExInYear(int exInYear) {
        this.exInYear = exInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "exInYear=" + exInYear +
                ", proSkill='" + proSkill + '\'' +
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
        System.out.println(this.toString());
    }
}
