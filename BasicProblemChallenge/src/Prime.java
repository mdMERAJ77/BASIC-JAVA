import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // Input: Taking a number from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Decision: Checking if the number is prime
        // Checking if the number is even
        if (number % 2 == 0) {
            System.out.println("is not prime");

        }
        // Checking if the number is 1
        else if (number == 1) {
            System.out.println("not prime");

        }
        // Assuming the number is prime
        else {
            System.out.println("is prime");

        }
    }
}
