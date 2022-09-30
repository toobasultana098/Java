package String;
public class EX3 
{
    public static void main(String[] args) 
    {
        String s="Mohandas Karamchand Ghandhi";
        String s1=s.substring(s.lastIndexOf(" ")+1)+s.substring(s.indexOf(" "),s.lastIndexOf(" "))+ " "+s.substring(0,s.indexOf(" "));
        System.out.println(s1);
    }
}