import java.util.Scanner;

public class RuppesPaisa {
    public static void main(String[] args) {
        System.out.println("How to Convert Rupees into Paisa");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Rupees RS=");
        float Rupees = sc.nextFloat();

        float Paisa = Rupees * 100;
        System.out.println("Paisa =" + Paisa);
    }
}
