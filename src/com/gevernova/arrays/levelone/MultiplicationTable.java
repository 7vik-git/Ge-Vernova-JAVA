package com.gevernova.arrays.levelone;

import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
