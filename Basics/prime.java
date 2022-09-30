import java.util.Scanner;
public class prime 
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        boolean b=isPrime(n);
        if(b==true)
        System.out.println("Prime No");
        else
        System.out.println("Not a Prime No");
        
    }
}
