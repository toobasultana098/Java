import java.util.Scanner;
public class root {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        if(n%2==0)
        {
            System.out.println("Square Root="+Math.sqrt(n));
        }
        else{
            System.out.println("Cube Root="+Math.cbrt(n));
        }
    }
}
