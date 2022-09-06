package Bai14;

public class GoodStudent extends Student{
    private double gpa;
    private String bestRewardName;
    public GoodStudent(){

    }

    public GoodStudent(String fullname, String dob, String sex, String phone, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullname, dob, sex, phone, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullname='" + fullname + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                "} " + super.toString();
    }

    @Override
    public void showMyInfor() {
        System.out.println(this);
    }
}
