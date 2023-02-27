import java.util.*;
public class sumofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer value");
        int a=sc.nextInt();
         int sum=sod(a);
        System.out.println("The sum of digits is "+sum);
    }
    public static int sod(int a)
    {
        int s=0;
        while(a!=0)
        {
            int d=a%10;
            s+=d;
            a/=10;
        }
        return s;
    }
}