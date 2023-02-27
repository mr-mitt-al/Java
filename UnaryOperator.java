public class UnaryOperator 
{
    public static void main(String args[])
    {
        //Pre Increment and Pre Decrement Unary Operator
        /*Firstly we will chnage the value
         Now we will use the value*/

         int a=10;
         int b=++a;
         int c=10;
         int d=--c;
         System.out.println("a= "+a);
         System.out.println("b= "+b);
         System.out.println("c= "+c);
         System.out.println("d= "+d);


         //Post Increment and Post Decrement Unary Operator
         /*Firstly we will use then value
         NOw we will change the value */ 

         int a1=10;
         int b1=a1++;
         int c1=10;
         int d1=c1--;
         System.out.println("a1= "+a1);
         System.out.println("b1= "+b1);
         System.out.println("c1= "+c1);
         System.out.println("d1= "+d1);

    }
    
}
