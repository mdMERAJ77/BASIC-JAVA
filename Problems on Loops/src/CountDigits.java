// Count the number of digits for a given number
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to input a number
        System.out.println("Please enter a number:");
        int number = sc.nextInt();

        int countDigits = 0;
        // Loop to count the digits in the number
        while (number > 0) {
            number = number / 10;
            countDigits++;
        }
        // Display the count of digits
        System.out.println("The number of digits is: " + countDigits);
    }
}
