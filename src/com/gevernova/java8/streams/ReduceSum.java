package com.gevernova.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,8,6,6,4,4,2,7);
        int sum = numbers.stream().filter(n -> n%2 == 0).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
