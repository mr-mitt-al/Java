import java.util.*;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year in the format YYYY");
        int y=sc.nextInt();
        if(y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                {
                    System.out.println("It is a LEAPYEAR "+y);
                }
                else
                {
                    System.out.println("It is NOT A LEAPYEAR "+y);
                }
            }
            else
            {
                System.out.println("It is a LEAPYEAR "+y);

            }
        }
        else
        {
            System.out.println("It is NOT A LEAPYEAR "+y);

        }
       
    }
    
}
