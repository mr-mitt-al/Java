import java.util.*;
public class Primenumberrange 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        
        int r=sc.nextInt();
        for(int i=2;i<=r;i++)
        {
            isPrime2(i);
        }
    }
    public static void isPrime2(int a)
    {
        boolean flag=true;
        for(int j=2;j<=Math.sqrt(a);j++)
        {
            if(a%j==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println(a);
        }

        
    }
    
}
