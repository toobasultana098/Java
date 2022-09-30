import java.util.*;

public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s;
        int[] a=new int[26];
        System.out.print("Input Word : ");
        s=sc.next();
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                int y=(ch-65);
                a[y]++;
            }
            
        }
        System.out.println("LETTER \t FREQUENCY");
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                System.out.println((char)(65+i)+"\t\t"+a[i]);
            }
        }
        String st;
        int n;
        System.out.println("Input String : ");
        st=sc.next();
        System.out.println("Input Position : ");
        n=sc.nextInt();
        String str= st.substring(n-1);
        for(int i=0;i<str.length();i=i+2){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
    }
    
}
