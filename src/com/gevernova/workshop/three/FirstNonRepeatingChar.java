package com.gevernova.workshop.three;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
                hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0) + 1);
        }
        char[] words = str.toCharArray();
        boolean isTrue = false;
        for(int i=0;i<words.length;i++){
            char ch = words[i];
            if(hmap.get(ch)==1) {
                System.out.println("First Non Repeating Character is : " + ch);
                isTrue = true;
                break;
            }
        }
        if(isTrue==false){
            System.out.println("There is no repeating char");
        }

    }
    }

