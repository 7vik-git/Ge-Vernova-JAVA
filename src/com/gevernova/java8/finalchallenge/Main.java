package com.gevernova.java8.finalchallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("jon", 51000);
        Employee emp2 = new Employee("alex",70000);
        Employee emp3 = new Employee("jos", 35000);
        List<Employee> list = Arrays.asList(emp1, emp2, emp3);
        List<String> filteredList = list.stream()
                .filter(employee -> employee.getSalary()>50000)
                .map(Employee :: getName)
                .sorted()
                .map(String::toUpperCase)
                .toList();
        System.out.println(filteredList);

    }
}
