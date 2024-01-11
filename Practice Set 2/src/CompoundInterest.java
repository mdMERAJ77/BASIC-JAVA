import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculate The Compound Interest...");

        System.out.print("Enter the Amount: ");
        float Amount=sc.nextFloat();

        System.out.print("Enter the Annual Interest Rate: ");
        float Rate=sc.nextFloat();

        System.out.print("Enter the years: ");
        float years=sc.nextFloat();

        double CompoundInterest=Amount*Math.pow((1+Rate/100),years);
        System.out.println("Your Compound Interest is: "+CompoundInterest);

        double TotalAmount=CompoundInterest+Amount;
        System.out.print("Total Amount is: "+TotalAmount);



    }
}
