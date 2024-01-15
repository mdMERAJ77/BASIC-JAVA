import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary_number: ");
        int binary_number=sc.nextInt();

        int ans=0;
        int power=1;
        while(binary_number>0)
        {
            ans+=(power*(binary_number%10));
            binary_number/=10;
            power=power*2;
        }
        System.out.println("Decimal number is: "+ans);

    }
}