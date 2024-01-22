import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int fact=1;
        for(int i=0;i<number;i++){
            fact*=number-i;
        }
        System.out.println("Factorial number of "+number+" is: "+fact);
    }
}
