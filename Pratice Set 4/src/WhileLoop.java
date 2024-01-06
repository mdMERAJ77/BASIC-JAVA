import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number:- ");
        int number=sc.nextInt();

        int i=1,sum=0;
        while(i<=number)
        {
            /*
            sum=i+number;
              i++;
             */
// Here both are correct but:-  sum = sum+=i; better than sum=i+number;
            sum += i; // shorthand Operator used
            i++;

            System.out.println("sum is:- "+sum);
            System.out.println("i is:- "+i);
        }
        System.out.println("finally sum is "+sum);
        System.out.println("finally i is "+i);
    }
}
