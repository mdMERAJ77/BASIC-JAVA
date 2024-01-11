import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row=sc.nextInt();

        System.out.print("Enter the column: ");
        int column=sc.nextInt();

        for(int i =1; i<=row; i++)
        {
            for(int j =1; j<=column; j++)
            {
                System.out.print("*");
            }
            System.out.println();       // for new line
        }
    }
}
