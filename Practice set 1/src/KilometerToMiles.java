import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[] args) {
        System.out.println("Convert Kilometer To Miles...");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Kilometer ");
        float KiloMeter=sc.nextFloat();
        double Miles=(0.621371)*KiloMeter;

        System.out.println(Miles+" Miles");
    }
}
