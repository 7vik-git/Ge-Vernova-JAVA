package com.gevernova.classes.areaofcircle;
import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle : ");
        int radius = sc.nextInt();
        double result = Circle.circumference(radius);
        System.out.println("Circumference of Circle is : " + result);
        double result1 = Circle.area(radius);
        System.out.println("Radius is : " + result1);
    }
}
