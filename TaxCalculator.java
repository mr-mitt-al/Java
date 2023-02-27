import java.util.*;
public class TaxCalculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int i=sc.nextInt();
        double tax;
        if(i<500000)
        {
            tax=0.0;
        }
        else if(i>500000 && i<1000000)
        {

            tax=0.2*(i-500000);
        }
        else
        {
            int in=i;
            in=in-500000;
            tax=(0.2*500000)+(0.3*(i-500000));

        }
        System.out.println("The tax is "+tax);

    }
    
    
}
