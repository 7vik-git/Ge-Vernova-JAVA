package com.gevernova.thisstatic.university;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Harry Potter", 1001L, 'A');
        Student s2 = new Student("Hermione Granger", 1002L, 'A');
        Student s3 = new Student("Ron Weasley", 1003L, 'B');
        Student s4 = new Student("Draco Malfoy", 1004L, 'B');
        Student s5 = new Student("Luna Lovegood", 1005L, 'A');
        Student s6 = new Student("Neville Longbottom", 1006L, 'B');
        Student s7 = new Student("Ginny Weasley", 1007L, 'A');
        Student s8 = new Student("Cedric Diggory", 1008L, 'A');
        Student s9 = new Student("Cho Chang", 1009L, 'B');
        Student s10 = new Student("Fred Weasley", 1010L, 'C');
        Student.totalStudentsinUniversity();
        s2.getStudentDetails(s2);
        s2.getStudentDetails(s1);
    }
}
