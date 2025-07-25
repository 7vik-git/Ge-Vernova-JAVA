package com.gevernova.arrays.levelone;
import java.util.*;

class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

