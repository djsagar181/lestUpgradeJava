package com.sagar;

import java.util.Scanner;

public class Question {
    Scanner sc = new Scanner(System.in);
    String question, option1, option2, option3, option4;
    int ans,correct_ans,user_ans;
    public boolean askQuestion() {
        System.out.println(question);
        System.out.println("1." + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
        System.out.println("please choose an option");
        user_ans=sc.nextInt();
        if(user_ans==correct_ans){
            return true;
        }
        return false;

    }
}

