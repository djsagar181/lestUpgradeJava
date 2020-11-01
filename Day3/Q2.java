package com.sagar;
import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
        String name;
        int date;
        String month;
        float salary, tax;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of empp:");
        name = sc.nextLine();
        System.out.println("Enter the DOB of empp:");
        date = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Month of empp:");
        month = sc.nextLine();
        System.out.println("Enter the Salary of empp:");
        salary = sc.nextFloat();

        if (salary <= 200000) {
            tax = salary * 5 / 100;
            System.out.println("Tax is:" + tax);
        } else if (salary > 200000 && salary < 300000) {
            tax = salary * 10 / 100;
            System.out.println("Tax is:" + tax);
        } else if (salary >= 300000 && salary < 400000) {
            tax = salary * 15 / 100;
            System.out.println("Tax is:" + tax);
        } else if (salary >= 400000 && salary <= 500000) {
            tax = salary * 20 / 100;
            System.out.println("Tax is:" + tax);
        }
    }
}