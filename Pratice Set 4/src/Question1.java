//Print the sum of stream of integers in the input.
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Please Enter the number:- ");
        int number=sc.nextInt();

        int sum=0;
        while(number!=-1)
        {
            sum+=number;
            number=sc.nextInt();
        }

        System.out.println("Your choice is: "+number+" so the program has been terminated");
        System.out.print("Total sum is: "+sum);
    }
}
