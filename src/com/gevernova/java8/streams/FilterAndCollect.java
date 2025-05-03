package com.gevernova.java8.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alex", "Andrew", "Bhaskar", "Sukesh", "Gukesh", "Xavier");
        List<String> filteredList = list.stream()
                .filter(str -> str.startsWith("A"))
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
