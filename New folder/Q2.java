import java.util.*;

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s,st,z,x="",y="";
        System.out.println("Enter String : ");
		s=sc.nextLine();
        st = s.substring(s.lastIndexOf(" ")+1);
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U' ||ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                x+=ch;
            }
            else{
                y+=ch;
            }
        }
        System.out.println(y+x);


        System.out.println("Enter String : ");
        z=sc.nextLine();
        z.toLowerCase();
        String[] x1=z.split(" ");
        for(int i=0;i<x1.length;i++){
            char[] v =  x1[i].toCharArray();
            Arrays.sort(v);
            String u= new String(v);
            System.out.print(u+" ");
        }
    }
}