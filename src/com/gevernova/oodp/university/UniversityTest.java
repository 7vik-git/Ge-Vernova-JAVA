package com.gevernova.oodp.university;
public class UniversityTest {
    public static void main(String[] args) {
        // Professors
        Professor profJohn = new Professor("Dr. John Smith");
        Professor profAlice = new Professor("Dr. Alice Brown");

        // Courses
        Course cs101 = new Course("CS101 - Data Structures");
        Course phy101 = new Course("PHY101 - Physics");

        // Assign professors
        profJohn.assignCourse(cs101);
        profAlice.assignCourse(phy101);

        // Students
        Student s1 = new Student("Emily");
        Student s2 = new Student("Michael");

        // Enroll students
        s1.enrollCourse(cs101);
        s1.enrollCourse(phy101);
        s2.enrollCourse(cs101);

        // Output
        System.out.println(cs101);
        System.out.println(phy101);

        System.out.println("\n" + s1.getName() + "'s Courses: " + s1.getEnrolledCourses());
        System.out.println(profJohn.getName() + "'s Courses: " + profJohn.getTeachingCourses());
    }
}

