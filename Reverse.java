import java.util.*;
public class Reverse 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number which you want to reverse");
    int i=sc.nextInt();
    int re=0;

    while(i!=0)
    {
        int s=i%10;
        re=re*10+s;
        i/=10;
    }
    System.out.println("The reverse is "+re);
    System.out.println("Enter another number to find reverse");
    int j=sc.nextInt();
    int revv=0;

    for(;j!=0;j/=10)
    {
        int sd=j%10;
        revv=revv*10+sd;
    }
    System.out.println("The reverse is "+revv);

 }   
}
