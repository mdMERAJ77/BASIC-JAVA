import java.util.Scanner;
public class ProgramFinalVariable {
    public static final double Pi=(double) 22/7;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to use final variable to create constant...");
        System.out.print("Enter your Value: ");

        float Radius=sc.nextFloat();
        double AreaOfCircle=Pi*Radius*Radius;
        System.out.println("Area Of Circle: "+AreaOfCircle);

    }
}
