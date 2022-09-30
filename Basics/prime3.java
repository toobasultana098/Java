public class prime3 
{
    public static boolean isPrime(int j)
    {
        for(int i=2;i<=j/2;i++)
        {
            if(j%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        for(int j=100; j<=999;j++)
        {
            boolean b=isPrime(j);
            if(b==true)
            System.out.print(j+" ");
        }
    }
}
