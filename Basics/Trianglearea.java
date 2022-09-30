import java.util.Scanner;
public class Trianglearea 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int u;
        float a,b,c,s;
        double ar;
        System.out.println("1. Area of equilateral Triangle");
        System.out.println("2. Area of Iso-sceles Triangle");
        System.out.println("3. Area of Scalene Triangle");
        u=in.nextInt();
        switch(u)
        {
            case 1:
                System.out.println("Enter One Side of the triangle");
                a=in.nextFloat();
                ar=(Math.sqrt(3)*a*a)/4.0;
                System.out.println("Area of equilateral :"+ar);
                break;
            case 2:
                System.out.println("Enter Side and base of the triangle");
                a=in.nextFloat();
                b=in.nextFloat();
                ar=(Math.sqrt((4.0*a*a)-(b*b))*b)/4.0;
                System.out.println("Area of Iso-sceles :"+ar);
                break;
            case 3:
                System.out.println("Enter the three sides of the triangle");
                a=in.nextFloat();
                b=in.nextFloat();
                c=in.nextFloat();
                s=(a+b+c)/2;
                ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Area of Scalene :"+ar);
                break;
            default:
                System.out.println("Enter a valid input");
        }
    }
}
