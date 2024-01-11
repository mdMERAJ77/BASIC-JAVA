import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) // Loop for each row
        {
            // Loop to print spaces before the asterisks
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }

            // Loop to print asterisks in the pyramid pattern
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
