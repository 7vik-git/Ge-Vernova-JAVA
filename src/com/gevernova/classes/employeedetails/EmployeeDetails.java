package com.gevernova.classes.employeedetails;

import java.util.Scanner;

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
