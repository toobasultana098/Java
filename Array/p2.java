
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[],i,n;
        System.out.println("Enter the size:");
        n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Elements are :");
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}
