import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();

        int ans=0;
        for(int i=0;i<=number;i++){
            ans=(ans*10)+number%10;
            number=number/10;
        }
        System.out.println(ans);
    }
}
