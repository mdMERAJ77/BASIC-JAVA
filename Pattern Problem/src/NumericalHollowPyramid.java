import java.util.Scanner;

public class NumericalHollowPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Print the current number
            System.out.print(i);

            // Print spaces inside the pyramid
            if (i > 1) {
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }

                // Print the current number for i greater than 1
                System.out.print(i);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
