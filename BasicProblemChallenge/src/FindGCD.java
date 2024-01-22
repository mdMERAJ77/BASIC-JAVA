import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Taking two numbers from the user
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        // Calculating GCD using the provided method
        int gcd = gcd(first, second);

        // Output: Displaying the calculated GCD
        System.out.print("GCD of the two numbers is: " + gcd);
    }

    // Function to calculate GCD using iterative approach
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;

        // Find the least of the two numbers
        int least = least(num1, num2);

        // Iterate from 2 to the minimum of the two numbers
        while (i <= least) {
            // Check if both numbers are divisible by the current iterator value
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update the GCD
            }
            i++;
        }

        return gcd;
    }

    // Function to find the smaller of two numbers
    public static int least(int num1, int num2) {
        // Return the smaller of the two numbers
        return (num1 < num2) ? num1 : num2;
    }
}
