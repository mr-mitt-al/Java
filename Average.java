import java.util.*;
public class Average 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        float f3=sc.nextFloat();
        double avg=(f1+f2+f3)/3;
        System.out.println("The average is "+avg);
    }
    
}
