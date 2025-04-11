package com.gevernova.classes;
import java.util.Scanner;
 class CheckPalindrome{
     String text;
     public boolean isPalindrome(String str){
         int i = 0;
         int j= str.length()-1;
         while(i<j){
             if(str.charAt(i)!=str.charAt(j)){
                 return false;
             }else{
                 i++;
                 j--;
             }
         }
         return true;
     }

 }
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the Word : ");

    }
}
