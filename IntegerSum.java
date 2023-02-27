import java.util.*;
public class IntejagerSum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the limit");
        //int l=sc.nextInt();
        int sum=0;
        int sum2=0;
        do{
            System.out.println("Enter any number");
            int i=sc.nextInt();
            if(i%2==0)
            {
                sum=sum+i;
                System.out.println("The sum of even numbers is "+sum);
                System.out.println("The sum of odd numbers is "+sum2);

            }
            else
            {
                sum2=sum2+i;
                System.out.println("The sum of even numbers is "+sum);
                System.out.println("The sum of odd numbers is "+sum2);

            }

        }while(true);
    }
    
}
