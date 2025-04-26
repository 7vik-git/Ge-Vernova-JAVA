package com.gevernova.arrays.levelone;
import java.util.*;


public class CanVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= scanner.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]<0){
                System.out.println("Invalid Entry");
            }
            else if(arr[i]<18){
                System.out.println("Cannot Vote");
            }else{
                System.out.println("Can Vote");
            }
        }
     }
}
