import java.util.*;
public class binarytodecimal 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any binary number");
        int b=sc.nextInt();
          int re=todecimal(b);
         System.out.println("Equivalent decimal is "+re);
    } 
    public static int todecimal(int a)
    {
        int result=0;
        int po=0;
        while(a!=0)
        {
            int d=a%10;
            result=result+d*(int)(Math.pow(2,po));
            a/=10;
            po++;

        }
    return result;
    }
}
