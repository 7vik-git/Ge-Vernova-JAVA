package com.gevernova.arrays.levelone;

import java.util.Scanner;

class ArrayNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] > arr[4]) {
            System.out.println("First element is greater than last element");
        } else if (arr[0] < arr[4]) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First and last elements are equal");
        }
    }
}


