package com.sagar;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Avengers a[]=new Avengers[5];
		a[0]=new Avengers("Hulk",30,"gamma radiation","muscle","Earth");
		a[1]=new Avengers("Captain",100,"Super soldier","vibranium shield","Earth");
		a[2]=new Avengers("Black Panther",40,"heart shape herb","anti metal claws","wakanda");
		a[3]=new Avengers("Thor",300,"thunder","hammer","odin");
		a[4]=new Avengers("Iron man",30,"robot","suite","Earth");
		System.out.println("Avenger 1");
		a[0].display();
		System.out.println("Avenger 2");
		a[1].display();
		System.out.println("Avenger 3");
		a[2].display();
		System.out.println("Avenger 4");
		a[3].display();
		System.out.println("Avenger 5");
		a[4].display();


	}
}
