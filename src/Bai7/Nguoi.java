package Bai7;

public class Nguoi {
    private String name;
    private int age;
    private String hometown;
    private String id;

    public Nguoi(String name, int age, String hometown, String id) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.id = id;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
