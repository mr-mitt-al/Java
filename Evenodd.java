import java.util.*;
public class Evenodd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        float f=sc.nextFloat();
        if(f%2==0.0)
        {
            System.out.println("The number is even "+f);
        }
        else
        {
            System.out.println("The number is odd");

        }
    }
    
}
