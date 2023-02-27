import java.util.*;
public class Bill 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float p=sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float pen=sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float e=sc.nextFloat();
        double total=(p+pen+e);
        total=total+(0.18*total);
        System.out.println("The total cost is  "+total);

    }
    
}
