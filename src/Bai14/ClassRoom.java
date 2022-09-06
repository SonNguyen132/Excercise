package Bai14;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<Student> students;
    public ClassRoom(){
        this.students = new ArrayList<>();
    }
    //Ham them sinh vien
    public void add(Student student){
        this.students.add(student);
    }
    //Ham hien thi sinh vien
    public void showMyInfor(){
        this.students.forEach(s -> System.out.println(s.toString()));
    }
}
