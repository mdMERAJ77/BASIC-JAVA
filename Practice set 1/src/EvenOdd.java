import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        System.out.println("Check is Odd Even...");
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int number=sc.nextInt();

        if(number %2==0)
        {
            System.out.println(number + " is Even.");
        }
        else
        {
            System.out.println(number + " is Odd.");
        }


    }
}
