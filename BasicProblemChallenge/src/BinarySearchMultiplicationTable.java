import java.util.Scanner;

public class BinarySearchMultiplicationTable {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array (sorted)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search for: ");
        int target = sc.nextInt();

        // Binary search
        int left = 0, right = array.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                found = true;


                // Print multiplication table
                System.out.println("Multiplication of " + target + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(target + " x " + i + "=" + (target * i));
                }
                break;
            }

            else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}






























