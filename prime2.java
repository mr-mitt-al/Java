import java.util.*;
public class prime2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        isPrime(n);
    }
    public static void isPrime(int a)
    {
        boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                isPrime=false;
                break;
            }
        }
    if(isPrime==true)
    {
        System.out.println("PRIME");
    }
    else
    {
        System.out.println("NOT PRIME");
    }
    }

    
}
