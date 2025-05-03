package com.gevernova.java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;


public class CompareStringLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hello","World","jon","wick","wdjdcefv","wqdjdnvieqrv","wef");
        names.sort((s1,s2) -> Integer.compare(s2.length(),s1.length()));
        System.out.println(names);
    }
}
