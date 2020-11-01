package com.sagar;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int marks1, marks2, marks3, marks4, marks5,total;
        float per;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks1:");
        marks1 = sc.nextInt();
   //     System.out.println(marks1);
        System.out.println("Enter the marks2:");
        marks2 = sc.nextInt();
 //       System.out.println(marks2);
        System.out.println("Enter the marks3:");
        marks3 = sc.nextInt();
 //       System.out.println(marks3);
        System.out.println("Enter the marks4:");
        marks4 = sc.nextInt();
//        System.out.println(marks4);
        System.out.println("Enter the marks5:");
        marks5 = sc.nextInt();
//        System.out.println(marks5);

        total=marks1+marks2+marks3+marks4+marks5;
        per=(total / 500.0f) * 100;
        System.out.println("Percentage is:"+per);

        if(per>=70 && per<=100) {
            System.out.println("A");
        }
        else if(per>=50 && per <70)   {
            System.out.println("B");
        }
        else if (per>=35  && per <=49){
            System.out.println("C");
        }
        else {
            System.out.println("F");

        }
    }

}