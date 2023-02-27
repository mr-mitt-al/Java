import java.util.*;
public class Ternaryoperator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int i=sc.nextInt();
        // Ternary operator
        // Synatax: variable=(Condition)?Ststement1:Statement2;
        String ty=(i%2==0)?"EVEN":"ODD";
        System.out.println("The number is "+ty);
    }
    
}
