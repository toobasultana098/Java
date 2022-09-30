import java.util.Scanner;
public class Primeornot 
{
    public static boolean isPrime(int n,int i)
    {
        if(i>n/2)
        return true;
        else{
            if(n%i==0)
            return false;
            else
            return isPrime(n, i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        boolean b=isPrime(n,2);
        if(b==true)
        {
            System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
    }
}
