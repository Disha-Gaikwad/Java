import java.lang.*;

public class Swap 
{
    public static void main(String[] args) 
  {
        int a = 9, b = 12;
        a=a^b;
        b=a^b;
        a=a^b;       //Swapping two numbers without using third variable
        System.out.println("a = "+a);
        System.out.println("b = "+b);
   }
}
