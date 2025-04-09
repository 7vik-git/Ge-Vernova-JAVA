package com.gevernova.inbuilt;
import java.util.Scanner;

public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        generateFibonacci(terms);
    }
}

