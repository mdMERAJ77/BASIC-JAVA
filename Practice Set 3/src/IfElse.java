import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal...");
        System.out.print("Please Enter Your Age:- ");

        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible for License");
        }
        else
        {
            System.out.println("You are not Eligible for License");
        }
    }
}
