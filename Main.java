package com.Epam.company.HomeWork2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int daysInOneMonth= 31;
        final int daysInAYear=365;
        Scanner sc = new Scanner(System.in);
        System.out.print("The Amount = ");
        double amount=sc.nextDouble();
        System.out.print("Months =  ");
        int months=sc.nextInt();
        System.out.print("The percentage, % = ");
        double percentage=sc.nextDouble();
        double finalPercentage=percentage/100;
        double income = amount * months * daysInOneMonth * finalPercentage / daysInAYear;
        System.out.println("Income = " + income + " $");
    }
}