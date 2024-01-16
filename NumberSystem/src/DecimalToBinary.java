import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int power=1, ans=0;
        System.out.print("Enter the decimal number: ");
        int decimal_number=sc.nextInt();

        while(decimal_number>0)
        {
            int parity=decimal_number%2;
            ans+=(parity*power);
            power*=10;
            decimal_number/=2;
        }
        System.out.println("Binary number is: "+ans);
    }
}
