
import java.util.Scanner;
public class LSearch 
{
    public static int search (int a[],int s)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                return (i+1);
            }
        }
        return (0);
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
        System.out.println("Enter the element to be searched ");
        s=in.nextInt();
        int b=search(a,s);
        if (b==0)
        {
            System.out.println("The Element is not present!!!");
        }
        else{
            System.out.println("The Element is present in index "+(b-1));
        }
    }
}
