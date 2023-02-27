import java.util.*;
public class decTobin 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any decimal number");
        int dec=sc.nextInt();
        tobin(dec);
    }
    public static void tobin(int decn)
    {
        String s="";
        while(decn!=0)
        {
            int d=decn%2;
            
            decn=decn/2;
            String s2=Integer.toString(d);
            s=s2+s;

        }
    System.out.println("Equivalent Binary = "+s);
    }
}
