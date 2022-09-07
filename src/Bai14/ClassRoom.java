package Bai14;

import Bai13.Employee;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public ClassRoom(){
        this.students = new ArrayList<>();
    }
    //Ham them sinh vien
    public void add(Student student){
        this.students.add(student);
    }
    //Ham hien thi sinh vien
    public List<Student> show(){
        return this.students;
    }
}
