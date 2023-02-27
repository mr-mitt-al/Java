import java.util.*;
public class PoNe 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        float f=sc.nextFloat();
        String ty=(f>=0)?"POSITIVE":"NEGATIVE";
        System.out.println(" The number is "+ty+" "+f);
    }
    
}
