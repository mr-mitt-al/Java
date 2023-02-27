import java.util.*;
public class BREAKQ 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int j=0;;j++)
        {
            System.out.println("Enter any number");
            int i=sc.nextInt();
            if(i%10==0)
            {
                break;
            }
            else
            {
                System.out.println("The number is "+i);
            }
        
        }
    System.out.println("You have entered a multiple of 10 ");
    }
    
}
