import java.util.*;
public class AreaC 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r=sc.nextFloat();
        float pi=3.14f;
        float area=pi*r*r;
        float perimeter=2*pi*r;
        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+perimeter);

    }
    
}
