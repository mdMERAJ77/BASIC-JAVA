import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row=sc.nextInt();

        System.out.print("Enter the column: ");
        int column=sc.nextInt();

        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=column;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
