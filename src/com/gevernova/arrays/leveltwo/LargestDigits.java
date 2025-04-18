package com.gevernova.arrays.leveltwo;
import java.util.Scanner;
public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();
        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

        while(number!=0) {
            int digit=number%10;
            digits[index]=digit;
            index++;
            number/=10;
            if(index==maxDigit) break;
        }

        int largest=0;
        int secondLargest=0;

        for(int i=0;i<index;i++) {
            if(digits[i]>largest) {
                secondLargest=largest;
                largest=digits[i];
            } else if(digits[i]>secondLargest && digits[i]!=largest) {
                secondLargest=digits[i];
            }
        }

        System.out.println("The largest digit is "+largest);
        System.out.println("The second largest digit is "+secondLargest);
    }
}

