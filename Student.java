import java.util.*;
public class Student 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int m=sc.nextInt();
        String p=(m>=33)?"PASS":"FAIL";
        System.out.println("The student has "+p+" with marks "+m);
    }

    
}
