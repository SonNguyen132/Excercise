package Bai8;

public class SinhVien {
    private String name;
    private int age;
    private String lop;

    public SinhVien(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lop='" + lop + '\'' +
                '}';
    }
}
