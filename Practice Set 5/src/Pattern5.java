import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number=sc.nextInt();

        for(int i=1; i<=number;i++)
        {
            for(int j=0; j<number;j++)
            {
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
}
