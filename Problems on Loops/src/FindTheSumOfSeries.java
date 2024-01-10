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
/* For Example user Enter 5
For i = 1 (odd), ans = 0 + 1 = 1
For i = 2 (even), ans = 1 - 2 = -1
For i = 3 (odd), ans = -1 + 3 = 2
For i = 4 (even), ans = 2 - 4 = -2
For i = 5 (odd), ans = -2 + 5 = 3
So, the sum of the series S = 1 - 2 + 3 - 4 + 5 up to n = 5 is 3.
*/
