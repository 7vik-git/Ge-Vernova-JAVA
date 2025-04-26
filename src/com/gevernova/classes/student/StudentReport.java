package com.gevernova.classes.student;

public class StudentReport {
    public static void main(String[] args) {
//        System.out.println("Enter Student Name, Roll_No, Marks ");
        GetStudentDetails student1 = new GetStudentDetails("John", 25, 91);
        GetStudentDetails student2 = new GetStudentDetails("Wick", 19, 47);

        student1.displayDetails();
        student2.displayDetails();


    }
}
