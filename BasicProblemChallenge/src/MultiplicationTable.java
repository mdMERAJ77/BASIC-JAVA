import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiplication table...");
        int number=sc.nextInt();
        for(int i=1;number>=i;i++)
        {
           int num=2*i;
            System.out.println("2*"+i+"="+num);
        }
    }
}