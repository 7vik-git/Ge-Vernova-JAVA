package com.gevernova.encapsulation.emplyee;

public class PartTimeEmployee extends Employee implements Department{
    private int bonus;
    private int workingHours;
    private String department;
    protected PartTimeEmployee(int employeeId, String name, int baseSalary, int workingHours) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(){
        if(workingHours>18){
            bonus =  workingHours*9;
        }
    }

    @Override
    public int calculateSalary() {
        return workingHours*getBaseSalary()+bonus;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department=dept;
    }

    @Override
    public String getDepartment() {
        return department;
    }
    public void showDetails(){
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getEmployeeId());
        System.out.println("Salary : " + calculateSalary());
        System.out.println("Dept : " + getDepartment());
    }
}
