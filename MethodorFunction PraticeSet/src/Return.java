import java.util.Scanner;

// Class to demonstrate adding two numbers obtained from user input
public class Return {

    // Main method to execute the program
    public static void main(String[] args) {
        //greet method
        greet();
        // Get the first number from user input and add 1
        int first = AddToNumber() + 1;

        // Get the second number from user input
        int second = AddToNumber();

        // Calculate the sum of both numbers
        int sum = first + second;

        // Display the result
        System.out.println("Sum of the numbers is " + sum);
    }

    // Function to prompt the user to enter a number and return it
    public static int AddToNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("Welcome...");
    }
}
