import java.util.*;
public class testEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number of your choice");
        int a=sc.nextInt();
        boolean f=isEven(a);
        System.out.println("Number is Even is "+f);
    }
    public static boolean isEven(int a)
    {
        boolean d=false;
        if(a%2==0)
        {
            d=true;
        }
        return d;
    } 
}
