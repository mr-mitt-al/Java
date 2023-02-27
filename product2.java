import java.util.*;
public class product2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        double result=product(a,b);
        System.out.println("The result is "+result);
    }
    public static float product( float r,float s)
    {
        float pro=r*s;
        return pro;
    }
    
}
