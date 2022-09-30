
import java.util.Scanner;
public class Words
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,x,rev=0;
        System.out.println("Enter a number ");
        n=in.nextInt();
        String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        while(n>0)
        {
            x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        while(rev>0)
        {
            x=rev%10;
            System.out.print(s[x]+" ");
            rev=rev/10;
        }
    }
}
