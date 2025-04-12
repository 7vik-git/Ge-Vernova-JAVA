package com.gevernova.constructors;

 public class Course {
    private static String instituteName;
    private String courseName;
    private int duration;
    private int fee;
    public static void updateInstituteName(String name){
       instituteName = name;
    }

    Course(String courseName, int duration , int fee){
    this.courseName = courseName;
    this.fee = fee;
    this.duration = duration;
    }

    public void displayCourseDetails(){
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fee : " + fee + "$");
     }


 }
   class Main1 {
       public static void main(String[] args) {
           Course.updateInstituteName("BridgeLabz");
           Course course1 = new Course("Java",3,500);
           course1.displayCourseDetails();
           Course.updateInstituteName("GE Vernova");
           course1.displayCourseDetails();
       }
    }
