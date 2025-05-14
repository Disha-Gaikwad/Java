import java.lang.*;
import java.util.*;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10,b=6,c;
        c = a&b;
        System.out.println("a&b = " +c);
        c = a|b;
        System.out.println("a|b = "+c);
        c = ~a ;
        System.out.println("a~b = "+c);
        c = a<<1;
        System.out.println("a<<1 = "+c);
        c = a>>1;
        System.out.println("a>>1 = "+c);

        int x=-10,y;
        y=x>>1;
        System.out.println("x>>1 = "+y);
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        y=x>>>1;
        System.out.println("x>>>1 = "+y);
        System.out.println(String.format("%32s",Integer.toBinaryString(y)));
        }
    }
