//Store random values
package Array;
import java.util.Scanner;
import java.util.Random;
public class p3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[],i,n;
        System.out.println("Enter the size:");
        n=in.nextInt();
        a=new int[n];
        Random r=new Random();
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            //a[i]=in.nextInt();
            a[i]=r.nextInt(100)+5;
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}
