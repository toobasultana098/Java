import java.util.*;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String s,s1="";
		String x="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String y="abcdefghijklmnopqrstuvwxyz";
        String z="0123456789";
        char[] x1 = x.toCharArray();
        char[] x2 = y.toCharArray();
        char[] x3 = z.toCharArray();
		int n;
		System.out.println("Enter String : ");
		s=sc.next();
		System.out.println("Enter Encoding number : ");
		n=sc.nextInt();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    if(n>0){
                        int d= ((ch-65)+n)%26;
                        char g=x1[d];
                        s1+=g;
                    }
                    else if(n<0){
                        int d= ((ch-65)+(26+n))%26;
                        char g=x1[d];
                        s1+=g;
                    }
                }
                else{
                    if(n>0){
                        int d= ((ch-65)+n)%26;
                        char g=x2[d];
                        s1+=g;
                    }
                    else if(n<0){
                        int d= ((ch-65)+(26+n))%26;
                        char g=x2[d];
                        s1+=g;
                    }
                }
            }
            else if(Character.isDigit(ch)){
                if(n>0){
                    int d= ((ch-48)+n)%10;
                    char g=x3[d];
                    s1+=g;
                }
                else if(n<0){
                    int d= ((ch-48)+(48+n))%26;
                    char g=x3[d];
                    s1+=g;
                }
            }    
        }
        System.out.println(s1);
    }
}