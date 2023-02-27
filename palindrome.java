import java.util.*;
public class palindrome 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number of your choice");
        int a=sc.nextInt();
        int b=reverse(a);
        if(a==b)
        {
        System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
    public static int reverse(int a)
    {
        int re=0;
        while(a!=0)
        {
            int d=a%10;
            re=re*10+d;
            a/=10;
        }
        return re;

    }
}
