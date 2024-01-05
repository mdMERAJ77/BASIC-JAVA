// Calculate Ticket Price According to Gender and Age...
import java.sql.SQLOutput;
import java.util.Scanner;
public class MyFirstProject
{
    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Displaying initial welcome message
        System.out.println("Welcome to Ticket Discount Calculator...");

        // Checking if user has a free pass
        System.out.print("You have a Free Pass? (true/false):- ");
        boolean isFreePass = sc.nextBoolean();
        sc.nextLine();

        if (isFreePass)
        {
            // Handling entry with a free pass
            int PassPassword = 786;
            System.out.print("Please Enter Your Password ");
            String CheckPassword = sc.nextLine();

            // Verifying the password for the free pass
            if (CheckPassword.equals(String.valueOf(PassPassword)))
            {
                System.out.print("Please Enter your Name:- ");
                String NameOfFreePass = sc.nextLine();

                // Displaying welcome message for users with a valid free pass
                System.out.println("Welcome " + NameOfFreePass + "\nHappy Journey");
            }
            else
            {
                // Handling incorrect password input
                System.out.println("Wrong Password Please Try Again...");
                return;
            }
            return;
        }

        // Asking user for their gender
        System.out.print("Are you a Male? (true/false): ");
        boolean isMale = sc.nextBoolean();
        sc.nextLine();

        if (isMale)
        {
            // Handling inputs for male users
            System.out.print("Please Sir Enter your Name:- ");
            String NameOfMale = sc.nextLine();
            System.out.println("Welcome " + NameOfMale);

            // Asking for age of male user
            System.out.print("Please " + NameOfMale + " Enter your Age: ");
            int AgeOfMale = sc.nextInt();

            // Setting discount percentages for different age brackets of males
            double DiscountMaleChild = 65;
            double DiscountMaleSeniorCitizen = 40;
            double DiscountMaleAboveAgeOfSeven = 15;

            if (AgeOfMale >= 60)
            {
                // Calculating discount for senior male citizens
                System.out.println("Sir you will get 40% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountMaleSeniorCitizen / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            }
            else if (AgeOfMale <= 5)
            {
                // Calculating discount for young male users
                System.out.println("Sir you will get 65% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountMaleChild / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            }
            else if (AgeOfMale > 7)
            {
                // Calculating discount for male users above 7 years old
                System.out.println("Sir you will get 15% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountMaleAboveAgeOfSeven / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            }
        }

        // Handling inputs for female users
        System.out.print("Are you a Female? (true/false): ");
        boolean isFemale = sc.nextBoolean();
        sc.nextLine();

        if (isFemale)
        {
            // Handling inputs for female users
            System.out.print("Please Ma'am Enter your Name:- ");
            String NameOfFemale = sc.nextLine();
            System.out.println("Welcome " + NameOfFemale);

            // Asking for age of female user
            System.out.print("Please " + NameOfFemale + " Enter your Age: ");
            int AgeOfFemale = sc.nextInt();

            // Setting discount percentages for different age brackets of females
            double DiscountFemaleChild = 75;
            double DiscountFemaleSeniorCitizen = 50;
            double DiscountFemaleAboveAgeOfSeven = 25;

            if (AgeOfFemale >= 60)
            {
                // Calculating discount for senior female citizens
                System.out.println("Ma'am you will get 50% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountFemaleSeniorCitizen / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            } else if (AgeOfFemale <= 5)
            {
                // Calculating discount for young female users
                System.out.println("Ma'am you will get 75% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountFemaleChild / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            }
            else if (AgeOfFemale > 7)
            {
                // Calculating discount for female users above 7 years old
                System.out.println("Ma'am you will get 25% discount...");
                System.out.print("Please Enter your Ticket Price: ");
                double TicketPrice = sc.nextDouble();

                // Calculating the discounted price and displaying the result
                double Discount = TicketPrice * (DiscountFemaleAboveAgeOfSeven / 100);
                double PayPlease = TicketPrice - Discount;
                System.out.println("You have to pay: " + PayPlease + "\nHappy Journey");
                return;
            }
        }
        // Handling situations where all boolean options are set to false
        System.out.println("You have selected all false option.\nPlease choose the correct option...");
    }
}

