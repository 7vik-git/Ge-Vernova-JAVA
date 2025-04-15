package com.gevernova.encapsulation.emplyee;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(15983,"Jon",51000,5100);
        PartTimeEmployee emp2 = new PartTimeEmployee(65874,"Alex",25,21);
        emp1.assignDepartment("HR");
        emp2.assignDepartment("Sales");
        emp2.showDetails();
        emp1.showDetails();
    }
}
