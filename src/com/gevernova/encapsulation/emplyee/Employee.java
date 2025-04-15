package com.gevernova.encapsulation.emplyee;

public abstract class Employee {
    private final int employeeId;
    private final String name;
    private int baseSalary;

    protected Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }

    public abstract int calculateSalary();


}
