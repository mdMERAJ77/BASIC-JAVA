import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Calculate The Area of Circle...");

        System.out.println("Enter the Radius1: ");
        Scanner sc=new Scanner(System.in);
        float radius1=sc.nextInt();

        System.out.println("Enter the Radius2: ");
        float radius2=sc.nextInt();

        double Area=3.14*radius1*radius2;
        System.out.println("Area Of Circle is = "+Area);



    }
}
