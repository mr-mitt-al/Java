import java.util.*;
public class characterpattern 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        char d='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(d);
                d++;
            }
            System.out.println();
        }
        System.out.println("Pattern printed successfully");
    }
    
}
