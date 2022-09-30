package String;
import java.util.Scanner;
public class EX5 {
    static void sort(String x[])
    {
        int i,j,n=x.length;
        String tmp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(x[j].length()>x[j+1].length())
                {
                    tmp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=in.nextLine();
        String x[]=s.split(" ");
        sort(x);
        for(String i: x)
        {
            System.out.println(i);
        }
        
    }
}
