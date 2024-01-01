import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {

        System.out.println("Calculate Area Of Triangle...");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Base Of Triangle");
        float Base=sc.nextInt();

        System.out.println("Enter the Height of Triangle");
        float Height=sc.nextInt();

        double Area =0.5*(Base*Height);

        System.out.println("Area Of Triangle = "+Area);

    }
}
