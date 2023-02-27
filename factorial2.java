import java.util.*;
public class factorial2 
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int a=sc.nextInt();
        int re=fact(a);
        System.out.println("The result is "+re);
    }

    public static int fact(int num)
    {
        int s=1;
        while(num!=1)
        {
            s*=num;
            num--;
        }
        return s;
    }
    
}
