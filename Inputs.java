import java.util.*;
public class Inputs 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any String value");
        String name=sc.nextLine();
        System.out.println("The String value is "+name);

        System.out.println("Enter any integer value");
        int i=sc.nextInt();
        System.out.println("The integer value is "+i);
       
        System.out.println("Enter any float value");
        float f=sc.nextFloat();
        System.out.println("The float value is "+f);

        System.out.println("Enter any double value");

        double d=sc.nextDouble();
        System.out.println("The double value is "+d);

        System.out.println("Enter any character value");
        char ch=sc.next().charAt(0);
        System.out.println("The character value is "+ch); 

        System.out.println("Enter any long interger value");
        long l=sc.nextLong();
        System.out.println("The long integer value is "+l);

        System.out.println("Enter any short integer value");
        short s=sc.nextShort();
        System.out.println("The short integer value is "+s);

        System.out.println("Enter any boolean value");
        boolean b=sc.nextBoolean();
        System.out.println("The boolean value is "+b);

        
    }
    
}
