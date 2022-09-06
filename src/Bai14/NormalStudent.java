package Bai14;

public class NormalStudent extends Student{
    private int englishCore;
    private double entryTestCore;

    public NormalStudent() {
    }

    public NormalStudent(String fullname, String dob, String sex, String phone, String universityName, String gradeLevel, int englishCore, double entryTestCore) {
        super(fullname, dob, sex, phone, universityName, gradeLevel);
        this.englishCore = englishCore;
        this.entryTestCore = entryTestCore;
    }

    public int getEnglishCore() {
        return englishCore;
    }

    public void setEnglishCore(int englishCore) {
        this.englishCore = englishCore;
    }

    public double getEntryTestCore() {
        return entryTestCore;
    }

    public void setEntryTestCore(double entryTestCore) {
        this.entryTestCore = entryTestCore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishCore=" + englishCore +
                ", entryTestCore=" + entryTestCore +
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
