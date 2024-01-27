import java.util.Scanner;

public class CountDigits {

    // Method to count the number of digits in a given number
    public static int countDigits(int number) {
        int count = 0;

        // Keep dividing the number by 10 until it becomes 0
        // Increment the count in each iteration
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Return the count of digits
        return count;
    }

    // Main method where the program execution starts
    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Read the user input
        int inputNumber = sc.nextInt();

        // Count the digits using the countDigits method
        int digitCount = countDigits(inputNumber);

        // Display the result
        System.out.println("Number of digits: " + digitCount);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
