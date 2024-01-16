import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Uncomment the following block to demonstrate different ways to create a String
        // 1. Using the new keyword
        String name = new String("Meraj");

        // 2. Using the literal assignment
        String name = "Meraj";

        // Print the value of the string
        System.out.print(name);
        */

        /*
        // Uncomment the following block to demonstrate formatting and printing variables
        int a = 6;
        float b = 5.235252f;

        // Basic formatting with placeholders
        System.out.printf("The value of a is %d and value of b is %f", a, b);

        // Formatting with precision for the floating-point number
        System.out.printf("\nThe value of a is %d and value of b is %.2f", a, b);

        // Formatting with width for the floating-point number
        System.out.printf("\nThe value of a is %d and value of b is %10f", a, b);
        */

        // Uncomment the following block to demonstrate taking input using Scanner
        Scanner sc = new Scanner(System.in);

        // Use next() to read a single word or nextLine() to read a whole line
        // String st = sc.next();
        String st = sc.nextLine();

        // Print the input string
        System.out.println(st);
    }
}
