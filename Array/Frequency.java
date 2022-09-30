
import java.util.Scanner;
public class Frequency 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,n,t;
        System.out.println("Enter the number : ");
        n=in.nextInt();
        int a[]={0,0,0,0,0,0,0,0,0,0};
        while (n>0)
        {
            t=n%10;
            a[t]+=1;
            n=n/10;
        }
        for(i=0;i<10;i++)
        {
            if(a[i]>0)
            System.out.println(i+"\t"+a[i]);
        }
    }
}