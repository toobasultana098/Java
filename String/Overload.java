// Calculate area of Square, Rectangle, Circle and Trinagle using Function Overloading...

import java.lang.Math;
import java.util.Scanner;
public class Overload {
    public static void area(int a){
        System.out.println("Area = "+(a*a));
    }
    public static void area(int a,int b){
        System.out.println("Area = "+(a*b));
    }
    public static void area(float r){
        System.out.println("Area = "+(3.14*r*r));
    }
    public static void area(int a,int b, int c){
        int s=(a+b+c)/2;
        int ar=s*(s-a)*(s-b)*(s-c);
        double are=Math.pow(ar,1/2);
        System.out.println("Area = "+are);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,a,b,c;
        float r;
        System.out.println("1---Square   2---Reactangle   3---Circle   4---Triangle");
        n=in.nextInt();
        if(n==1){
            System.out.println("Enter side of the square : ");
            a=in.nextInt();
            area(a);
        }
        else if(n==2){
            System.out.println("Enter lenght and breadth of the reactangle : ");
            a=in.nextInt();
            b=in.nextInt();
            area(a,b);
        }
        else if(n==3){
            System.out.println("Enter radius of the circle : ");
            r=in.nextFloat();
            area(r);
        }
        else{
            System.out.println("Enter side 3 of the Triangle : ");
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            area(a,b,c);
        }
    }
}
