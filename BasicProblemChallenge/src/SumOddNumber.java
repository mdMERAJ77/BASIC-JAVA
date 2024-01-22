import java.util.Scanner;
public class SumOddNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int sum=0;
            for(int i=1;i<=number;i++)
            {
                if(i%2!=0){
                    sum+=i;
                }
            }
        System.out.print("Sum of all odd number is: "+sum);
    }
}
