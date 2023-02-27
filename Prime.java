import java.util.*;
public class Prime 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number which you want to check as prime or not");
    int a=sc.nextInt();
    int flag=0;
    if(a==2)
    {
        System.out.println("PRIME NUMBER");
    }
    else
    {
    for(int i=2;i<=Math.sqrt(a);i++)
    {
        if(a%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        System.out.println("PRIME NUMBER");

    }
    else{
        System.out.println("NOT A PRIME NUMBER");
    }
}
}   
}
