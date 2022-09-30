
import java.util.Scanner;
public class Sorting {
    public static void sort(int a[],int n)
    {
        int i,j,t;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a[],i,n,s;
        System.out.println("Enter the size:");
        n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        sort(a,n);
        
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}
