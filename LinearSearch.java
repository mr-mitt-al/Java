import java.util.*;
public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements  you want to enter into the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements  into the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements  you want to search");
        int key=sc.nextInt();
        int f=check(key,arr);
        if(f==-1)
        System.out.println("Element Not Found");
        else
        System.out.println("Element Found At index "+f);
       
        
        
    }
    public static int check(int key,int arr[])
    {
        
        for(int j=0;j<arr.length;j++)
        {
            if(key==arr[j])
            {
                return j;
                
            }

        }
        return -1;
    }
   
}