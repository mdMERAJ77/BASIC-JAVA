import java.sql.SQLOutput;

public class IfElseLadder{
    public static void main(String[] args)
    {
        boolean IsSeniorCitizen = false;
        boolean IsAdult =false;
        boolean IsTeenager =true;
        if(IsSeniorCitizen)
            {
                System.out.println("Hello Senior Citizen");
            }
        else if(IsAdult)
        {
            System.out.println("Hello Adult");
        }
        else if(IsTeenager)
        {
            System.out.println("Hello Teenager");
        }
        else
        {
            System.out.println("Hello Kids");
        }

        }
}