
import java.util.Random;
public class p4 {
    public static boolean isPrime(int j)
    {
        for(int i=2;i<=j/2;i++)
        {
            if(j%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[],i;
        a=new int[100];
        Random r=new Random();
        System.out.println("Enter the elements:");
        for(i=0;i<100;i++)
        {
            a[i]=r.nextInt(100)+5;
        }
        for(int j=0; j<=100;j++)
        {
            boolean b=isPrime(j);
            if(b==true)
            System.out.print(j+" ");
        }
    }
}
