import java.util.*;
public class onetoN 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit to which you want to print the numbers");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(i+",");
            i++;
        }
        

    }
    
}
