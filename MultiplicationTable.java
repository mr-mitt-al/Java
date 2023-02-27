import java.util.*;
public class MultiplicationTable 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number which you want to print multiples ");
    int a=sc.nextInt();
    System.out.println("Enter the limit ");
    int l=sc.nextInt();
    for(int i=1;i<=l;i++)
    {
        System.out.println(a+"*"+i+"="+(a*i));
    }
    System.out.println("The table has been printed successfully");
 }   
}
