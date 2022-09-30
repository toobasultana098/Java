// Circumference Of the Circle

import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float r;
        double a;
        System.out.println("Enter radius of the circle : ");
        r=in.nextFloat();
        a=2.00*3.14*r;
        System.out.println("Circumference = " + a);
    }
}
