import java.util.*;

public class Q9 {
    public static int Prime(int n){
        for(int i=3;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,m;
        System.out.println("Enter two numbers : ");
        n=sc.nextInt();
        m=sc.nextInt();
        if(m-n==2 || n-m==2){
            int u=Prime(n);
            int v=Prime(m);
            if(u==1 && v==1){
                System.out.println("Twin Prime numbers. ");
            }
            else{
                System.out.println("Not Twin Prime numbers. ");
            }
        }
        else{
            System.out.println("Not Twin Prime numbers. ");
        }
        Prime(n);
    }
}
