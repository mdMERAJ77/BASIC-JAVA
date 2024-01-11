import java.util.Scanner;

public class ConvertDaysIntoYMW {
    public static void main(String[] args) {
        System.out.println("Program to Convert Total Number Of Days into Years, Months, Weeks, and remaining days...");
        System.out.print("Enter Days: ");
        Scanner sc = new Scanner(System.in);

        int Days, Years, Months, Weeks;
        Days = sc.nextInt();
        Years = Days / 365;
        Days %= 365;

        Months = Days / 30;
        Days %= 30;

        Weeks = Days / 7;
        Days %= 7;

        System.out.println("Years: " + Years);
        System.out.println("Months: " + Months);
        System.out.println("Weeks: " + Weeks);
        System.out.println("Days: " + Days);
    }
}
