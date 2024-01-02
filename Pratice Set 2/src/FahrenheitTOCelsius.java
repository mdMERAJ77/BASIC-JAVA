import java.util.Scanner;
public class FahrenheitTOCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Convert Fahrenheit to Celsius...");
        System.out.print("Enter your Temperature in Fahrenheit: ");
        float Fahrenheit=sc.nextFloat();

        float Celsius=(Fahrenheit-32)*5/9;
        System.out.print(Celsius+" degree Celsius\n");

        System.out.println("Convert Celsius To Fahrenheit...");
        System.out.print("Enter your Temperature in Celsius: ");
        float Celsi=sc.nextFloat();

        float Fahren=9*Celsi/5+32;
        System.out.println(Fahren+" degree Fahrenheit");


    }
}
