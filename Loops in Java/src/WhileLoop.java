import java.util.Scanner;
public class WhileLoop
{
    public static void main(String[] args)
    {
       int Number=1;    // initialization

       while(Number <= 10)      // Condition
       {
           System.out.println(Number);    // Output

           Number=Number+1;     // updating the condition
       }


        System.out.println("Reverse Number ");
       int num=10;
       while (num >=1)
       {
           System.out.println(num);
           num=num-1;
       }


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:- ");
       int i=0;
       while(i<5)
       {

           int input=sc.nextInt();
           System.out.println("Number is "+ input);
           i=i+1;
       }
    }
}