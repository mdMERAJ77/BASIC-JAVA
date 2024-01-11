import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Calculate The Simple Interest...");
        System.out.print("Enter your Amount: ");
        double Amount=sc.nextDouble();

        System.out.print("Enter your Rate of Interest: ");
        float Rate=sc.nextFloat();

        System.out.print("Enter your year: ");
        float year=sc.nextFloat();

        double SimpleInterest=((Amount*Rate*year)/100);
        System.out.println("SimpleInterest is "+SimpleInterest);

        double TotalAmount=Amount+SimpleInterest;
        System.out.println("TotalAmount is: "+TotalAmount);
    }
}

