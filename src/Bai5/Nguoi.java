package Bai5;

public class Nguoi {
    private String name;
    private int age;
    private String cmnd;
    private Phong phong;

    private int soNguoi;

    public Nguoi(String name, int age, String cmnd, Phong phong, int soNguoi) {
        this.name = name;
        this.age = age;
        this.cmnd = cmnd;
        this.phong = phong;
        this.soNguoi = soNguoi;
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cmnd='" + cmnd + '\'' +
                ", phong=" + phong +
                ", soNguoi=" + soNguoi +
                '}';
    }
}
