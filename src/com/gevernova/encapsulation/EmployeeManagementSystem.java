package com.gevernova.encapsulation;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

   public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedBonus) {
        super(id, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "JohnWick", 100000, 10000);
        Employee e2 = new PartTimeEmployee(2, "BobTheBuilder", 10000, 20, 500);

        Department d1 = (Department) e1;
        Department d2 = (Department) e2;

        d1.assignDepartment("Assassin");
        d2.assignDepartment("Support");

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            System.out.println();
        }
    }
}
