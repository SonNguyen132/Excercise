package Bai14;

public abstract class Student {
    protected String fullname;
    protected String dob;
    protected String sex;
    protected String phone;
    protected String universityName;
    protected String gradeLevel;

    public Student() {
    }

    public Student(String fullname, String dob, String sex, String phone, String universityName, String gradeLevel) {
        this.fullname = fullname;
        this.dob = dob;
        this.sex = sex;
        this.phone = phone;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public abstract void showMyInfor();
}
