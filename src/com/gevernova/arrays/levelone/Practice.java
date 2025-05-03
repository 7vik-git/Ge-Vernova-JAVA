package com.gevernova.arrays.levelone;

import java.util.Arrays;

public class Practice {
    static int[] data = {5,6,9,1};
    public static void modifyArray(int arr[]){
        arr[1]+=1;
        data = arr;
    }
    public static void main(String[] args) {
        modifyArray(data);
        System.out.println(Arrays.toString(data));
    }
}
