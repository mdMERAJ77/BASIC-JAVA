// Import the Scanner class from java.util package
import java.util.Scanner;

// Define a class named Algebra
class Algebra {

    // Constructor for the Algebra class
    Algebra() {
        System.out.println("I am constructor...");
    }

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
}

// Main class named Main
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Algebra class
        Algebra obj = new Algebra();

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        // Display the sum of the two numbers
        System.out.print("Sum of the two numbers is: ");

        // Call the add method from the Algebra class and store the result in 'ans'
        int ans = obj.add(x, y);

        // Display the result
        System.out.println(ans);
    }
}
