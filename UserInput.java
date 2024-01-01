import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number is ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("Enter the 2nd number is ");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("The sum of numbers is = "+sum);

    }
}
