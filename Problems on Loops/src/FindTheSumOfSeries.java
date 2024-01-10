// Find The Sum of the following series:- S=1-2+3-4+5-6...n
import java.util.Scanner;
public class FindTheSumOfSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number...");
        int Number=sc.nextInt();

        int ans=0;
        for(int i=1;i<=Number;i++)
        {
            if(i % 2 == 0)
            {
                ans-=i; // ans=ans-i;
            }
            else
            {
                ans+=i;    // ans=ans+i;
            }
        }
        System.out.println("Sum is: "+ans);
    }

}
