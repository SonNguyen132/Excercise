package Bai6;

public class HocSinh {
    private String name;
    private int age;
    private String homeTown;
    private int lop;

    public HocSinh(String name, int age, String homeTown, int lop) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", lop=" + lop +
                '}';
    }
}
