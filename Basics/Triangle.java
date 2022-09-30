import java.util.Scanner;
class Triangle{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        float s,area;
        System.out.println("Enter 3 sides of a triangle");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        s=(a+b+c)/2.0f;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area="+area);
        in.close();
    }
}