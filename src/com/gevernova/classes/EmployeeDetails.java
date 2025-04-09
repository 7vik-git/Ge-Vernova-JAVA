package com.gevernova.classes;
import java.util.Scanner;
class Employee{
    String employeeName;
    int salary;
    int ID;
    int age;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(){

    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        System.out.println("Enter Employee 1 Name : ");
        employee1.setEmployeeName(sc.next());
        System.out.println("Enter Employee 2 Name : ");
        employee2.setEmployeeName(sc.next());
        System.out.println("Enter Employee 3 Name : ");
        employee3.setEmployeeName(sc.next());

        System.out.println("Employee 1 name is : " + employee1.getEmployeeName());
    }
}
