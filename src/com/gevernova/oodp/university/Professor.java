package com.gevernova.oodp.university;
import java.util.*;

public class Professor {
    private String name;
    private List<Course> teachingCourses;

    public Professor(String name) {
        this.name = name;
        this.teachingCourses = new ArrayList<>();
    }

    public String getName() { return name; }

    public void assignCourse(Course course) {
        teachingCourses.add(course);
        course.setProfessor(this);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    @Override
    public String toString() {
        return "Professor: " + name;
    }
}

