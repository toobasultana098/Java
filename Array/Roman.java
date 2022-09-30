
import java.util.Scanner;
public class Roman {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,a,j;
        System.out.println("Enter a number ");
        n=in.nextInt();
        int x[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        while(n>0)
        {
            a=n/x[i];
            if(a!=0)
            {
                for(j=1;j<=a;j++)
                {
                    System.out.print(s[i]);
                }
            }
            n=n%x[i];
            i++;
        }
    }
}