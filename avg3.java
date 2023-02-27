import java.util.*;
public class avg3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=avg(a,b,c);
        System.out.println("The average of the numbers is "+d);
    }
    public static float avg(float a,float b,float c)
    {
        float average=(a+b+c)/3;
        return average;
    }
}
