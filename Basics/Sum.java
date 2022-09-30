import java.util.Scanner;
public class Sum {
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter two numbwrs");
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Sum = "+c);
        in.close();
    }
}
