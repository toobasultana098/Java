//Input a string and display both in forward and backward direction

import java.util.Scanner;
public class EX1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=in.nextLine();
        System.out.println("String is=");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.print(ch);
        }
        System.out.println("\nString in reverse order=");
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            System.out.print(ch);
        }
    }
}