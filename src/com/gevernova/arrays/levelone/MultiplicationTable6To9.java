package com.gevernova.arrays.levelone;
import java.util.*;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4]; // For 6, 7, 8, 9

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}

