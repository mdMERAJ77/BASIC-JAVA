import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Calculate Sum Of Three Numbers...");

        System.out.println("Enter the First number");
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextInt();

        System.out.println("Enter the Second number");
        float num2=sc.nextInt();

        System.out.println("Enter the Third number");
        float num3=sc.nextInt();

        float Sum =num1+num2+num3;
        System.out.println("Sum Of Three Numbers is = "+Sum);
    }
}
