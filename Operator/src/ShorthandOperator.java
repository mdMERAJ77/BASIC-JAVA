import java.util.Scanner;
public class ShorthandOperator {
    public static void main(String[] args) {
        int a=5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value x1: ");

        int x1=sc.nextInt();
        a=a+x1;
        System.out.println("a is "+a);
        // Now
        System.out.print("Enter the value of x2: ");
        int x2=sc.nextInt();
        a+=x2;
        System.out.println("a is "+a);
        a*=x2;
        System.out.println("a is "+a);
        a/=x2;
        System.out.println("a is "+a);
        a-=x2;
        System.out.println("a is "+a);
        a%=x2;
        System.out.println("a is "+a);
    }
}
