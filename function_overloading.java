/*  Function overloading depends upon two factors
1) Data type of parameters.
2) Number of parameters.
*/
// ******Function overloading does not depend on the return type of function.....
public class function_overloading 
{
    public static void main(String args[])
    {
        System.out.println(sum(2,3,4));
        
        System.out.println(sum(3,4));
        System.out.println(sum(3.5f,4.6f ));
        
    }
    public static int sum(int q,int w,int e)
    {
        return(q+w+e);
    }
    public static int sum(int g,int h)
    {
        return g+h;
    }
    public static float sum(float g,float h)
    {
        return g+h;
    }
    public static double sum(double g,double h)
    {
        return g+h;
    }
    
}
