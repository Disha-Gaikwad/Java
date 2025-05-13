import java.lang.*;
import java.util.*;

public class QuadraticExpression 
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double d,r1,r2;
    
        System.out.println("Enter a ");
        a=sc.nextInt();
        System.out.println("Enter b ");
        b=sc.nextInt();
        System.out.println("Enter c ");
        c=sc.nextInt();
    
        d=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+d)/(2*a);
        r2=(-b-d)/(2*a);

        System.out.println("First Root is "+r1);
        System.out.println("First Root is "+r2);

        }
    }
