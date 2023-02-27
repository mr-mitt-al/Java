import java.util.*;
public class Add 
{
    public static int addd(int num1,int num2)// These paramenters are known as formal parameters or just parameters.
    //These are written in function definition.
    {
        int sum=num1+num2;
        return sum;
    }

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=addd(a,b);// These paramenters are known as agruments or actual parameters.These are written while function calling.
    System.out.println("The result is "+result);
    }
    
}
