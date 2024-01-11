import java.util.Scanner;

public class InvertedTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=(row+1-i); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move outside the inner loop to start a new line after each row
        }
    }
}
