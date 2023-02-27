import java.util.Scanner;

import java.util.*;;
public class TypePromotion 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two characters");
        char c=sc.next().charAt(0);
        char d=sc.next().charAt(0);
        System.out.println("The difference in the two characters is "+(c-d));

        int a=45;
        float f=568.66f;
        short s=89;
        double d2=56893.4446;
        double ans=a+f+s+d2;
        System.out.println(ans);
    }
    
}
