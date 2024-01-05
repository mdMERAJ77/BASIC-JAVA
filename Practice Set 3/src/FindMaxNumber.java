import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number1:- ");
        float Number1 = sc.nextFloat(); // Using nextFloat() to read floating-point numbers
        System.out.print("Enter your Number2:- ");
        float Number2 = sc.nextFloat();

        // Comparing the input numbers
        if (Number1 > Number2)
        {
            System.out.println("(Number1) is Greater Than (Number2). Answer is " + Number1);
        }
        else if (Number1 < Number2)
        {
            System.out.println("(Number2) is Greater Than (Number1). Answer is " + Number2);
        }
        else if (Number1 == Number2)
        {
            // Both numbers are equal
            System.out.println("Both are equal numbers: " + Number1 + " and " + Number2);
        }
    }
}
