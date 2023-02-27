import java.util.*;
public class SumofNatural 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit");
        int limit=sc.nextInt();
        int i=1,sum=0;
        while(i<=limit)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum is "+sum);
    }
    
}
