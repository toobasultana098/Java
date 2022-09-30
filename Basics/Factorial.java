import java.util.Scanner;
public class Factorial 
{
    public static int fact(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,f;
        System.out.println("Enter a number");
        n=in.nextInt();
        f = fact(n);
        System.out.println("Factorial = " +f);
    }
}
