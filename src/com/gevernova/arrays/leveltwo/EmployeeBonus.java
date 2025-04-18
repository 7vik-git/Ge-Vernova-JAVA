package com.gevernova.arrays.leveltwo;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] salary=new double[10];
        double[] yearsOfService=new double[10];
        double[] bonus=new double[10];
        double[] newSalary=new double[10];
        double totalBonus=0,totalOldSalary=0,totalNewSalary=0;

        for(int i=0;i<10;i++) {
            System.out.print("Enter salary of employee " + (i+1) + ":");
            double s=scanner.nextDouble();
            System.out.print("Enter years of service of employee " + (i+1) + ":");
            double y=scanner.nextDouble();
            if(s<=0||y<0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            salary[i]=s;
            yearsOfService[i]=y;
        }

        for(int i=0;i<10;i++) {
            if(yearsOfService[i]>5) {
                bonus[i]=salary[i]*0.05;
            } else {
                bonus[i]=salary[i]*0.02;
            }
            newSalary[i]=salary[i]+bonus[i];
            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

