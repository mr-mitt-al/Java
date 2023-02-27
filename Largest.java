import java.util.*;
public class Largest 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers ");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        if(f1>f2)
        {
            System.out.println("First number is greater "+f1);
        }
        if(f2>f1)
        {
            System.out.println("Second number is greater "+f2);
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
    
}
