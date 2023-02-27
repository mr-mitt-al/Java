public class LogicalOperator 
{
    public static void main(String args[])
    {
        //LOGICAL AND
        System.out.println((3>2)&&(5<6));
        System.out.println((3<2)&&(5<6));
        System.out.println((3>2)&&(5>6));
        System.out.println((3<2)&&(5<6));

        // LOGICAL OR
        System.out.println((3>2)&&(5<6));
        System.out.println((3>2)&&(5>6));
        System.out.println((3<2)&&(5<6));
        System.out.println((3<2)&&(5>6));

        //LOGICAL NOT
        System.out.println(!(3>2));
        System.out.println(!(3<2));
    }
    
}
