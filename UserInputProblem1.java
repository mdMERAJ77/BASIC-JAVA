import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class UserInputProblem1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks in every Subjects...");
        Scanner sc=new Scanner(System.in);

        System.out.println("Marks in English");
        float English=sc.nextInt();

        System.out.println("Marks in JAVA");
        float JAVA=sc.nextInt();

        System.out.println("Marks in Python");
        float Python=sc.nextInt();

        System.out.println("Marks in Math");
        float Math=sc.nextInt();

        System.out.println("Marks in Physics");
        float Physics=sc.nextInt();

        float Percentage=(English+JAVA+Python+Math+Physics)/5;
        System.out.println("Percentage is = "+Percentage+"%");
    }
}
