import java.util.*;
public class Largestof3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        float f3=sc.nextFloat();
        if(f1>=f2 && f1>=f3)
        {
            System.out.println("The first number is the greatest "+f1);

        }
         else if(f2>=f1 && f2>=f3)
        {
            System.out.println("The second number is the greatest "+f2);

        }
        else
        {
            System.out.println("The third number is the greatest "+f3);

        }


    }
    
}
