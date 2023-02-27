import java.util.*;
public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        float f=sc.nextFloat();
        float g=sc.nextFloat();
        System.out.println("Enter your choice");
        System.out.println("Enter a to add two numbers");
        System.out.println("Enter s to subtract two numbers");
        System.out.println("Enter m to multiply two numbers");
        System.out.println("Enter d to divide two numbers");
        System.out.println("Enter r to find the remainder on  the division of two numbers");
        char ch=sc.next().charAt(0);
        double re;
        switch(ch)
        {
            case 'a':
            {
                re=f+g;
                System.out.println(" The result is "+re);
                break;
            }
            case 's':
            {
                re=f-g;
                System.out.println(" The result is "+re);
                break;
            }
            case 'm':
            {
                re=f*g;
                System.out.println(" The result is "+re);
                break;
            }
            case 'd':
            {
                re=f/g;
                System.out.println(" The result is "+re);
                break;
            }
            case 'r':
            {
                re=f%g;
                System.out.println(" The result is "+re);
                break;
            }
            default:
            {
                System.out.println("Wrong Choice. Pleae enter correct choice");

            }
        }

    }
}  

