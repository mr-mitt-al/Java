import java.util.*;
public class TypeCasting 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any decimal number");
        float f=sc.nextFloat();
        int a=(int) f;
        System.out.println("Equivalent interger is "+a);

        System.out.println("Characters can be directly converted to integer");
        System.out.println("Enter any character ");
        char ch=sc.next().charAt(0);
        int n1=ch;
        System.out.println("Enter any character ");
        char ch2=sc.next().charAt(0);
        int n2=ch2;
        System.out.println("the difference in two characters is "+(n1-n2));
    }


    
}
