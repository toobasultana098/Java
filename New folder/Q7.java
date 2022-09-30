import java.util.*;

public class Q7 {
    public static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    public static int small(int n){
        int a=9,b;
        while(n>0){
            b=n%10;
            if(b<a){
                a=b;
            }
            n=n/10;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        System.out.println("Factors are : ");
        factor(n);
        int x=small(n);
        System.out.println("Smallest Digit : "+x);
    }
}
