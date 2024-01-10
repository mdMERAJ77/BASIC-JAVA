import java.util.Scanner;
public class ReverseTheDigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Digits:- ");
        int Digits=sc.nextInt();

        int ans=0;
        while(Digits>0)
        {
            ans=ans*10+Digits%10;
            Digits/=10;

        }
        System.out.println(ans);
    }
}
