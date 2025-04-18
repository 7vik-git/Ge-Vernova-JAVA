package com.gevernova.oodp.university;
import java.util.*;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() { return courseName; }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " | Professor: " +
                (professor != null ? professor.getName() : "TBD") +
                " | Enrolled Students: " + students.size();
    }
}

