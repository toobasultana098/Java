// Find the value of one number raised to the power of another i.e. x^n...

import java.lang.Math;
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,x;
        double e;
        System.out.println("Enter two numbers for (x^n) : ");
        x=in.nextInt();
        n=in.nextInt();
        e=Math.pow(x,n);
        System.out.println(e);
    }
}
