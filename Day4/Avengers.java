package com.sagar;

public class Avengers {
    String name;
    int age;
    String power;
    String weapon;
    String planet;

    Avengers(String n,int a,String p,String w,String pl){
        name=n;
        age=a;
        power=p;
        weapon=w;
        planet=pl;
    }

    public void display(){
        System.out.print("Name is:"+ name +" "+"Age is:"+age+" "+"power is:"+power+" "+"weapon is :"+weapon+" "+"" +
                "planet is:"+planet);
        System.out.println();
    }
}
