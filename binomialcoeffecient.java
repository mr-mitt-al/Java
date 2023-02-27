import java.util.*;
public class binomialcoeffecient 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        int nn=fact(n);
        System.out.println("Factorial n= "+nn);
        int rr=fact(r);
        System.out.println("Factorial r= "+rr);
        int dif=fact(n-r);
        System.out.println("Factorial dif= "+dif);
        int result=nn/(rr*dif);
        System.out.println("The result is "+result);
    }
    
    public static int fact(int num1)
    {
        int r=1;
        while(num1!=1)
        {
            r*=num1;
            num1--;
        }
    return r;
    }
}
