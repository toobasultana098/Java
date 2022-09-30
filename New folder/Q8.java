import java.util.*;

public class Q8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char c;
        int n,i;
        System.out.println("Enter your choice : ");
        c=sc.next().charAt(0);
        if(c=='A' || c=='a' || c=='1'){
            System.out.println("Enter a number : ");
            n=sc.nextInt();
            for(i=2;i<=n;i++){
                for(int j=0;j<n-1;j++){
                    System.out.print(i+j);
                }
            }
        }
        if(c=='B' || c=='b' || c=='2'){
            
        }
    }
}
