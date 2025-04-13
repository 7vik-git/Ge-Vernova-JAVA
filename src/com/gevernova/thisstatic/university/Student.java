package com.gevernova.thisstatic.university;

public class Student {
    public static final String UNIVERSITY_NAME = "HogWarts";
    static int totalStudents;
    String studentName;
    final long rollNo;
    char grade;
    Student(String name, long rollNo, char grade){
        this.studentName = name;
        this.grade = grade;
        this.rollNo = rollNo;
        totalStudents++;
    }

    public static void totalStudentsinUniversity(){
        System.out.println(totalStudents);
    }
    public void getStudentDetails(Object obj){
        if(obj instanceof Student){
            System.out.println("******** " +UNIVERSITY_NAME+ " ********" );
            System.out.println("Student Name : " + studentName);
            System.out.println("Roll No : "+ rollNo);
            System.out.println("Student's Grade :" + grade);
        }
    }
}
