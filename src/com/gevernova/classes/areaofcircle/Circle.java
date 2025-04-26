package com.gevernova.classes.areaofcircle;


public class Circle{
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
