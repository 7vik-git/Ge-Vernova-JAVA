package com.gevernova.java8.lambdaexpression;
import java.util.function.Predicate;


public class CheckEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(53278234));

    }
}
