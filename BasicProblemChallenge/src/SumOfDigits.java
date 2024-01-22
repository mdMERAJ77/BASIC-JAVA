import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int sum=0;
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            sum+=i+1;
        }
        System.out.print(sum);
    }
}
