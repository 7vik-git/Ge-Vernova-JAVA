package com.gevernova.workshop.four;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 38, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .toList();


        List<Student> filteredListByRank = studentList.stream()
                .filter(student -> student.getRank()>50 && student.getRank()<100)
                .toList();


        List<Student> filteredListByState = studentList.stream()
                .filter(student -> student.getCity().toLowerCase().
                        equals("karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .toList();


        List<String> departmentNames = studentList.stream()
                .map(Student::getDept)
                .distinct()
                .toList();



        List<Student> sortedByRank = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .toList();

        Map<String,List<Student>> groupByDept = studentList.stream()
                .collect(Collectors.groupingBy(x->x.getDept()));
        System.out.println(groupByDept+",,gsdfgsdfgdsgsdfgsf,");

        for (String dept : groupByDept.keySet()) {
            System.out.println("Department: " + dept);
            for (Student student : groupByDept.get(dept)) {
                System.out.println(student);
            }
            System.out.println();
        }


        int totalBoysAge = studentList.stream()
                .filter(student -> student.getGender().equals("Male"))
                .map(Student::getAge)
                .reduce(0, (a, b) -> a+b);
        long totalBoys = studentList.stream()
                .filter(student -> student.getGender().equals("Male"))
                .count();

        int totalGirlsAge = studentList.stream()
                .filter(student -> student.getGender().equals("Female"))
                .map(Student::getAge)
                .reduce(0, (a, b) -> a+b);
        long totalGirls = studentList.stream()
                .filter(student -> student.getGender().equals("Female"))
                .count();
        float boysAvg = totalBoysAge /totalBoys;
        float girlsAvg = totalGirlsAge/totalGirls;




        System.out.println("Students with Rank btw 50 & 100 : ");
        for(Student stud : filteredListByRank){
            System.out.print(stud.getFirstName() + " ");
        }
        System.out.println();

        System.out.println("Students from Karnataka : ");
        for(Student stud : filteredListByState){
            System.out.print(stud.getFirstName() + " ");
        }
        System.out.println();

        System.out.println("Department Names ");
        for(String dept : departmentNames){
            System.out.print("'" + dept  + "' ");
        }
        System.out.println();

        System.out.println("All Contact Numbers ");
//        for(List num : contactNumbers){
//            System.out.println( num );
//        }
        System.out.println();

        System.out.println("Student with Second Highest Rank : ");
        System.out.println(sortedByRank.get(1).getFirstName());
        System.out.println();

        System.out.println("Average age of Boys is : " + boysAvg);
        System.out.println("Average age of Girls is " + girlsAvg);


    }
}
