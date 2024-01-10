import java.util.Scanner;
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number=sc.nextInt();

        double remainder , ans=0 , OriginalNumber=number;
        while(number>0)
        {
            remainder=number%10;
            ans+=Math.pow(remainder,3);
// or       ans+=remainder*remainder*remainder;
            number/=10;
        }
        if(OriginalNumber == ans)
        {
            System.out.println(OriginalNumber+" is Armstrong");
        }
        else
        {
            System.out.println(OriginalNumber+" is not Armstrong");
        }
    }
}
