
import java.util.*;

public class math {
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s;
        int q ;
        System.out.println("Enter a string:");
        s=in.nextLine();
        String x[]=s.split(" ");
        int a[]=new int[x.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(x[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        q=a[0];
        for(int i=a[a.length-1]*2+q;i<100;i++)
        {
            if(isPrime(i))
            {
                int c=0;
                for(int j=1;j<a.length;j++)
                {
                    if(i%a[j]!=q)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==0)
                {
                    System.out.println("Value of p="+i);
                    break;
                }
            }
        }
    }
    
}