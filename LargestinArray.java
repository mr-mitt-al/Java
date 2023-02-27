import java.util.*;
public class LargestinArray 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers into the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=largest(arr);
        System.out.println("The largets element in the array is "+l);
    }
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }

    
}
