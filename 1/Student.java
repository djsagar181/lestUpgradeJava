import java.util.Scanner;
public class Student{

      int roll;
      String name;
      float marks;

      public void input()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll:");
        roll=sc.nextInt();
        System.out.println("Enter name of student:");
        name=sc.next();
        System.out.println("Enter marks of student:");
        marks=sc.nextFloat();
  
      }
 
     void display()
     {
          System.out.println("The roll no is" +roll);
          System.out.println("The student name is:" +name);
          System.out.println("The marks is:" +marks);
      }
        
      public static void main(String[] args)
       {
        Student s1=new Student();
        s1.input();
        s1.display();
       } 

        
    }
