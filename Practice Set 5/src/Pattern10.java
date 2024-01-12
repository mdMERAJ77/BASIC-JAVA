import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the column: ");
        int column=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("2");
                }
            }
            System.out.println();
        }

    }
}