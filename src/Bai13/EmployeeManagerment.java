package Bai13;

import Bai2.ManagerDocument;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManagerment {
    private List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static Scanner scanner = new Scanner(System.in);
    public EmployeeManagerment(){
        this.employees = new ArrayList<>();
    }
    //Ham them nhan vien
    public void add(Employee employee){
        this.employees.add(employee);
    }
    //Ham xoa theo ID
    public boolean deleteByID(String id){
        Employee employee = this.employees.stream().filter(s ->s.getId() == id).findFirst().orElse(null);
        if(employee == null){
            return true;
        } else {
            return this.employees.remove(employee);
        }
    }
    //Ham tim tat ca nhan vien Experience
    public List<Employee> findEmployee(int employee_type){
        if(employee_type == 0){
            return this.employees.stream().filter(s -> s instanceof Experience).collect(Collectors.toList());
        }
        if (employee_type == 1) {
            return this.employees.stream().filter(s -> s instanceof Fresher).collect(Collectors.toList());
        }
        if (employee_type == 2){
            return this.employees.stream().filter(s -> s instanceof Intern).collect(Collectors.toList());
        }
        return this.employees;
    }

    //Ham tim tat ca nhan vien
    public List<Employee> findAll(){
        return this.employees;
    }

    //in ra file
    public List<Employee> getEmployees(){
        return employees;
    }
}
