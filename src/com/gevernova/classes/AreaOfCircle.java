package com.gevernova.classes;
import java.util.Scanner;

class Circle{
     int radius;
     static final double pi = 3.14;
     public static  double circumference(int radius){
         double result = 2*pi*radius;
         return result;
     }
     public static  double area(int radius){
         double result = pi*radius*radius;
         return result;
     }
}

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
