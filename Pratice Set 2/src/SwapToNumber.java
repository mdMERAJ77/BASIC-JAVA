import java.util.Scanner;
public class SwapToNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Before the Swapping:-");
        System.out.print("Enter value of A: ");
        int A=sc.nextInt();

        System.out.print("Enter value of B: ");
        int B=sc.nextInt();

        int C=A;
        A=B;
        B=C;

        System.out.println("\nAfter The Swapping:-");
        System.out.println("Value of A is: "+A);
        System.out.print("Value of B is: "+B);










    }
}