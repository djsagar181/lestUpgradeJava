package com.sagar;
import java.util.Scanner;
import java.util.ArrayList;
public class Q3 {
    public static void main(String agrgs[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int num :arr){
            sum=sum+num;
        }
        System.out.println("The sum of array is:");
        System.out.println(sum);
    }
}
