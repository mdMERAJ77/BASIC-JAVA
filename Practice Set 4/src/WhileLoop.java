import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int number = sc.nextInt();

        int i = 1, sum = 0;

        while (i <= number) {
            // The commented code below is incorrect, as it uses 'number' instead of 'i'
            // sum = i + number;
            // i++;

            // Use shorthand operator to accumulate the sum correctly
            sum += i;
            i++;

            // Print the intermediate results within the loop
            System.out.println("Intermediate sum is: " + sum);
            System.out.println("Intermediate i is: " + i);
        }

        // Print the final results outside the loop
        System.out.println("Finally, the sum is: " + sum);
        System.out.println("Finally, i is: " + i);
    }
}
