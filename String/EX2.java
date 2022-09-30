package String;

//Count nos of vowels and consonents
import java.util.Scanner;
class EX2{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String s;
        int v=0,c=0;
        System.out.println("Enter a string:");
        s=in.nextLine();
        s=s.toUpperCase();
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
        }
        System.out.println("Number of vowels = " +v);
        System.out.println("Number of consonants = " +c);
    }
}