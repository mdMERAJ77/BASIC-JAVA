// Calculate Ticket Price According to Gender and Age...
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator...");

        System.out.print("You have a Free Pass? (true/false):- ");
        boolean isFreePass =sc.nextBoolean();
        sc.nextLine();
        if(isFreePass) {


            int PassPassword = 786;
            System.out.print("Please Enter Your Password ");
            String CheckPassword = sc.nextLine();
            if (CheckPassword.equals(String.valueOf(PassPassword))) {
                System.out.print("Please Enter your Name:- ");
                String NameOfFreePass = sc.nextLine();


                System.out.println("Welcome "+NameOfFreePass+ "\nHappy Journey");

            } else {
                System.out.println("Wrong Password Please Try Again...");
                return;
            }
            return;
        }



        System.out.print("Are you a Male? (true/false): ");
        boolean isMale = sc.nextBoolean();
        sc.nextLine(); // Consume newline


        if (isMale) {
            System.out.print("Please Sir Enter your Name:- ");
            String NameOfMale = sc.nextLine();
            System.out.println("Welcome "+NameOfMale);

            System.out.print("Please "+NameOfMale+" Enter your Age: ");
            int AgeOfMale = sc.nextInt();

            double DiscountMaleChild = 65;
            double DiscountMaleSeniorCitizen = 40;
            double DiscountMaleAboveAgeOfSeven = 15;

            if (AgeOfMale >= 60) {
                System.out.println("Sir you will get 40% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                double Discount = TicketPrice * (DiscountMaleSeniorCitizen / 100);
                double PayPlease=TicketPrice-Discount;
                System.out.println("You have to pay: " + PayPlease+"\nHappy Journey");

                // Exit the method after discount calculation
                return;
            } else if (AgeOfMale <= 5) {
                System.out.println("Sir you will get 65% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                double Discount = TicketPrice * (DiscountMaleChild / 100);
                double PayPlease=TicketPrice-Discount;
                System.out.println("You have to pay: " + PayPlease+"\nHappy Journey");

                // Exit the method after discount calculation
                return;
            } else if (AgeOfMale > 7) {
                System.out.println("Sir you will get 15% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                double Discount = TicketPrice * (DiscountMaleAboveAgeOfSeven / 100);
                double PayPlease=TicketPrice-Discount;
                System.out.println("You have to pay: " + PayPlease+"\nHappy Journey");
                return;
            }
        }


        System.out.print("Are you a Female? (true/false): ");
        boolean isFemale = sc.nextBoolean();
        sc.nextLine(); // Consume newline

        if (isFemale) {
            System.out.print("Please Ma'am Enter your Name:- ");
            String NameOfFemale = sc.nextLine();
            System.out.println("Welcome " + NameOfFemale);

            System.out.print("Please " + NameOfFemale + " Enter your Age: ");
            int AgeOfFemale = sc.nextInt();

            double DiscountFemaleChild = 75;
            double DiscountFemaleSeniorCitizen = 50;
            double DiscountFemaleAboveAgeOfSeven = 25;

            if (AgeOfFemale >= 60) {
                System.out.println("Ma'am you will get 50% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                double Discount = TicketPrice * (DiscountFemaleSeniorCitizen / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");

                // Exit the method after discount calculation
                return;
            } else if (AgeOfFemale <= 5) {
                System.out.println("Ma'am you will get 75% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                double Discount = TicketPrice * (DiscountFemaleChild / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");

                // Exit the method after discount calculation
                return;
            } else if (AgeOfFemale > 7) {
                System.out.println("Ma'am you will get 25% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();
                double Discount = TicketPrice * (DiscountFemaleAboveAgeOfSeven / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");

                // Exit the method after discount calculation
                return;
            }
        }
        System.out.println("You have selected all false option.\nPlease choose the correct option...");
    }
}
