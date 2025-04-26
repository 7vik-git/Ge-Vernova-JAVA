package com.gevernova.classes.student;

class GetStudentDetails {
    private String name;
    private int roll_no;
    private int marks;
    private String grade;


    public GetStudentDetails(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void displayDetails() {
        calculateGrade();
        System.out.println("Student Name : ");
        System.out.println(name);
        System.out.println("Student Roll.No : ");
        System.out.println(roll_no);
        System.out.println("Student Marks : ");
        System.out.println(marks);
        System.out.println("Student Grade : ");
        System.out.println(grade);
    }

    private void calculateGrade() {
        if (marks >= 90) {
            grade = "O grade";
        } else if (marks >= 80 && marks < 90) {
            grade = "A+ grade";
        } else if (marks >= 70 && marks < 80) {
            grade = "A grade";
        } else if (marks >= 60 && marks < 70) {
            grade = "B+ grade";
        } else if (marks >= 50 && marks < 60) {
            grade = "B grade";
        } else {
            grade = "fail";
        }
    }
}
