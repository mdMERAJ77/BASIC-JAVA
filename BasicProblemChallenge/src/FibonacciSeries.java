import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.println("Enter the number of terms in the Fibonacci series: ");

        // Read the input from the user
        int number = sc.nextInt();

        // Initialize the first two numbers in the Fibonacci series
        int first = 0, second = 1;

        // Print a message to indicate the start of the Fibonacci series
        System.out.println("Fibonacci Series:");

        // Loop to generate and print the Fibonacci series up to the specified number of terms
        for (int i = 1; i <= number; i++) {
            // Print the current Fibonacci number
            System.out.print(first + " ");

            // Calculate the next Fibonacci number by adding the previous two
            int next = first + second;

            // Update the first and second variables for the next iteration
            first = second;
            second = next;
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
