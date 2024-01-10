// Question:- Given 2 numbers a and b. Find a raise to the power b.
import java.util.Scanner;
public class FindPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of A: ");
        int A=sc.nextInt();
        System.out.print("Enter the number of B: ");
        int B=sc.nextInt();
        int ans=1;
        for(int i=1; i<=B;i++)
        {
            ans=ans*A;
        }
        System.out.print("A raise to the Power B is: "+ans);
    }

}
