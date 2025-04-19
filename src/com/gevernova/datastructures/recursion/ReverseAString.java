package com.gevernova.datastructures.recursion;

public class ReverseAString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverse(input);
        System.out.println("Reversed string: " + result);
    }
}
