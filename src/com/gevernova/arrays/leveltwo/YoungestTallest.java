package com.gevernova.arrays.leveltwo;
import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        double[] heights=new double[3];

        for(int i=0;i<3;i++) {
            System.out.print("Enter age of " + names[i] + ":");
            ages[i]=scanner.nextInt();
            System.out.print("Enter height of " + names[i] + ":");
            heights[i]=scanner.nextDouble();
        }

        int youngestIndex=0;
        int tallestIndex=0;

        for(int i=1;i<3;i++) {
            if(ages[i]<ages[youngestIndex]) {
                youngestIndex=i;
            }
            if(heights[i]>heights[tallestIndex]) {
                tallestIndex=i;
            }
        }

        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}

