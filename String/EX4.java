package String;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i;
        System.out.println("Enter a string:");
        s=in.nextLine();
        s=s.toUpperCase();
        for (i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                break;
            }
        }
                String s1=s.substring(i,s.length())+s.substring(0,i)+"AY";
                System.out.println(s1);
    }
}
