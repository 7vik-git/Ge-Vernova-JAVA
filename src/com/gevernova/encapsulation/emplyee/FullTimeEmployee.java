package com.gevernova.encapsulation.emplyee;

    public class FullTimeEmployee extends Employee implements Department{
    private int bonus;
    private String department;
    protected FullTimeEmployee(int employeeId, String name, int baseSalary, int bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(){
        this.bonus = bonus;
    }
    @Override
    public int calculateSalary() {
        return getBaseSalary()+bonus;
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
