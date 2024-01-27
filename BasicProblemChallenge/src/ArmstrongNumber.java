import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for Armstrong: ");

        // Read the user input
        int numberToCheck = sc.nextInt();

        // Check if it's an Armstrong number
        if (isArmstrongNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is an Armstrong number");
        } else {
            System.out.println(numberToCheck + " is not an Armstrong number");
        }
        // Close the scanner to prevent resource leaks
        sc.close();
    }
    public static boolean isArmstrongNumber(int number) {
        // Count the number of digits
        int temp = number;
        int numDigits = 0;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }
        // Calculate the sum of each digit raised to the power of the number of digits
        temp = number;
        double armstrongSum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            armstrongSum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        // Check if the sum is equal to the original number
        return armstrongSum == number;
    }
}
