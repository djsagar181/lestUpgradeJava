import java.util.Scanner;

public class Sum {
    int num1,num2,res;

    public void get(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num 1:");
    num1=sc.nextInt();
    System.out.println("Enter num 1:");
    num2=sc.nextInt();
}
    public void add()
    {
      res=num1+num2;
       System.out.println("Addition of two number is :" +res);
    }
    public static void main(String[] args) {
        Sum s1=new Sum();
        s1.get();
        s1.add();
    }
    
}
