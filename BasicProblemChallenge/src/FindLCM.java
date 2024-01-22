import java.util.Scanner;
public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: Taking two numbers from the user
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        // Calculating LCM using the provided method
        int lcm = lcm(first, second);
        // Output: Displaying the calculated LCM
        System.out.print("LCM of the two numbers is: " + lcm);
    }
    // Function to calculate LCM using iterative approach
    public static int lcm(int first, int second) {
        int i = 1;
        // Iterate until a multiple of the first number is found that is also divisible by the second number
        while (true) {
            int factor = first * i;
            // Check if the multiple is divisible by the second number
            if (factor % second == 0) {
                return factor; // Return the LCM
            }
            i++;
        }
    }
}
