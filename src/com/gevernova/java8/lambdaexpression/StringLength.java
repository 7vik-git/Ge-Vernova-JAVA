package com.gevernova.java8.lambdaexpression;

import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test(""));
    }
}
