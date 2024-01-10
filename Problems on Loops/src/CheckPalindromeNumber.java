import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");// input 121  then output 121 is palindrome otherwise not palindrome
        int number=sc.nextInt();
        int OriginalNumber=number;

        int rem,ans=0;
        while(number>0)
        {
            rem=number%10;
            ans=rem+(ans*10);
            number/=10;
        }
        if(OriginalNumber == ans)
        {
            System.out.println("is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
